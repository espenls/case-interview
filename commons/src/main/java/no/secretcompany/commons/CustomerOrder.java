package no.secretcompany.commons;

import javax.validation.constraints.Size;

public class CustomerOrder {


    private long civilRegistrationNumber;

    @Size(min = 2, max = 50)
    private String firstName;
    private String lastName;
    private String insuranceType;

    public long getCivilRegistrationNumber() {
        return civilRegistrationNumber;
    }

    public void setCivilRegistrationNumber(long civilRegistrationNumber) {
        this.civilRegistrationNumber = civilRegistrationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }
}
