package no.secretcompany;

import no.secretcompany.commons.CustomerOrder;
import no.secretcompany.commons.InsuranceOrderResponse;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/insurance")
public class InsuranceResource {
    FagsystemMock fagsystemMock;

    public InsuranceResource() {
        fagsystemMock = new FagsystemMock();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createInsurance(@Valid CustomerOrder customerOrder) {
        InsuranceOrderResponse insuranceOrderResponse = new InsuranceOrderResponse(customerOrder);
        insuranceOrderResponse.setInsuranceStatus("draft");
        fagsystemMock.createInsurance(insuranceOrderResponse);
        return Response.ok(insuranceOrderResponse, MediaType.APPLICATION_JSON).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateInsurance(@Valid CustomerOrder customerOrder) {
        InsuranceOrderResponse insuranceOrderResponse = new InsuranceOrderResponse(customerOrder);
        insuranceOrderResponse.setInsuranceStatus("sent_customer");
        return Response.ok(insuranceOrderResponse, MediaType.APPLICATION_JSON).build();
    }
}