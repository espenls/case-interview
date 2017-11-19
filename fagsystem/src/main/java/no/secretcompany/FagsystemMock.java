package no.secretcompany;

import no.secretcompany.commons.InsuranceOrderResponse;

import java.util.HashMap;
import java.util.Map;

public class FagsystemMock {
    Map<Long, InsuranceOrderResponse> insuranceOrderResponseMap;
    Map<Long, InsuranceOrderResponse> customerResponseMap;


    public FagsystemMock() {
        insuranceOrderResponseMap = new HashMap<>();
        customerResponseMap = new HashMap<>();
    }

    public void createInsurance(InsuranceOrderResponse customerResponse) {
        customerResponseMap.put(customerResponse.getInsuranceNumber(), customerResponse);
    }

    public void updateInsurance(long insuranceNumber, InsuranceOrderResponse insuranceOrderResponse) {
        insuranceOrderResponseMap.put(insuranceNumber, insuranceOrderResponse);
    }

}
