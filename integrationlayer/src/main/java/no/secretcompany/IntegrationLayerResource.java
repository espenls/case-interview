package no.secretcompany;

import no.secretcompany.commons.CustomerResponse;
import no.secretcompany.commons.CustomerOrder;
import no.secretcompany.commons.InsuranceOrderResponse;
import no.secretcompany.commons.IntegrationLayerResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/integration/insurance")
public class IntegrationLayerResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createInsurance(CustomerOrder order) {

        FagsystemRestClient fagsystemRestClient = new FagsystemRestClient();

        //Fagsystem: Opprett kunde -> retur kunenummer
        CustomerResponse customerResponse = fagsystemRestClient.createCustomer(order);

        //Fagsystem: Opprett avtale -> avtalenummer
        InsuranceOrderResponse insuranceOrderResponse = fagsystemRestClient.createInsurance(order);


        //TODO send avtale til kunde -> status på utsendelse


        InsuranceOrderResponse updatedInsuranceOrder = fagsystemRestClient.updateStatus(order);
        //Fagsystem: oppdater status til avtale sendt  ->avtalestatus


        IntegrationLayerResponse responseData = new IntegrationLayerResponse();
        responseData.setInsuranceNumber(insuranceOrderResponse.getInsuranceNumber());
        responseData.setStatus(updatedInsuranceOrder.getInsuranceStatus());


        return Response.ok(responseData, MediaType.APPLICATION_JSON).build();
    }
}