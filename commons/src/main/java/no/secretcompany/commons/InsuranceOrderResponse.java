package no.secretcompany.commons;

import javax.validation.Valid;
import java.util.Date;

public class InsuranceOrderResponse {
    private long insuranceNumber;
    private Date startDate;
    private String insuranceType;
    private String insuranceStatus;

    public  InsuranceOrderResponse() {}

    public InsuranceOrderResponse(@Valid CustomerOrder customerOrder) {
        insuranceNumber = System.currentTimeMillis(); //TODO generate insuranceNumber
        startDate = new Date(System.currentTimeMillis());
        insuranceType = customerOrder.getInsuranceType();
        insuranceStatus = "draft";
    }


    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public long getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(long insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getInsuranceStatus() {
        return insuranceStatus;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }
}
