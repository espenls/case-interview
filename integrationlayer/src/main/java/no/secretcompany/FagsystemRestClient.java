package no.secretcompany;

import no.secretcompany.commons.CustomerResponse;
import no.secretcompany.commons.CustomerOrder;
import no.secretcompany.commons.InsuranceOrderResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

public class FagsystemRestClient {

    private static final String CUSTOMER_REST_URI = "http://localhost:8080/fagsystem/customer/";
    private static final String ORDER_REST_URI = "http://localhost:8080/fagsystem/insurance/";

    private Client client = ClientBuilder.newClient();

    public CustomerResponse createCustomer(CustomerOrder customerOrder) {
        return client
                .target(CUSTOMER_REST_URI)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(customerOrder, MediaType.APPLICATION_JSON), CustomerResponse.class);
    }

    public InsuranceOrderResponse createInsurance(CustomerOrder customerOrder) {
        return client
                .target(ORDER_REST_URI)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(customerOrder, MediaType.APPLICATION_JSON), InsuranceOrderResponse.class);
    }

    public InsuranceOrderResponse updateStatus(CustomerOrder customerOrder) {
        return client
                .target(ORDER_REST_URI)
                .request(MediaType.APPLICATION_JSON)
                .put(Entity.entity(customerOrder, MediaType.APPLICATION_JSON), InsuranceOrderResponse.class);
    }

}