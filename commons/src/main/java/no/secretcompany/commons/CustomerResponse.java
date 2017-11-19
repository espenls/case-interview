package no.secretcompany.commons;

public class CustomerResponse {
    private long id;
    private String name;
    private long insuranceNumber;

    public CustomerResponse() {
    }


    public CustomerResponse(CustomerOrder customerOrder) {
        id = customerOrder.getCivilRegistrationNumber();
        name = customerOrder.getLastName() + ", " + customerOrder.getFirstName();
        insuranceNumber = System.currentTimeMillis(); //TODO generate insurancenumber
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(long insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

}
