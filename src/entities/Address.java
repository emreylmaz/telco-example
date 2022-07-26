package entities;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private int id;
    private String addressDetails;
    private  AddressType  addressType;
    private final List<Subscription>  subscription = new ArrayList<>();

    public Address(int id, String addressDetails, AddressType addressType) {

        this.id = id;
        this.addressDetails = addressDetails;
        this.addressType = addressType;
    }
    public enum AddressType{
        HOME,
        BUSINESS
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public List<Subscription> getSubscription() {
        return subscription;
    }


}



