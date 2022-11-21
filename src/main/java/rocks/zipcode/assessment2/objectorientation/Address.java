package rocks.zipcode.assessment2.objectorientation;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;

    public Address() {
        addressLine1 = "";
        addressLine2 = "";
         city = "";
         state = "";
         zipcode = "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city,
                   String state, String zipcode) {

       setAddressLine1(addressLine1);
       setAddressLine2(addressLine2);
       setCity(city);
       setState(state);
       setZipcode(zipcode);

    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;

    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object address) {
        Address address1 = new Address();
        Address address2 = new Address();
        Boolean outcome = (address1 != address2);
        return outcome;
    }
}
