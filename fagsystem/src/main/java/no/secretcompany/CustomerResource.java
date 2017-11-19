package no.secretcompany;

import no.secretcompany.commons.CustomerOrder;
import no.secretcompany.commons.CustomerResponse;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customer")
public class CustomerResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createCustomer(@Valid CustomerOrder customerOrder) {
        CustomerResponse customerResponse = new CustomerResponse(customerOrder);
        return Response.ok(customerResponse, MediaType.APPLICATION_JSON).build();
    }
}