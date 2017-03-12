package org.contactBook.entity;

import org.contactBook.entity.enums.TypeAddress;

/**
 * Created by Yuriy Kolennikov on 12.03.2017.
 */
public class Address {

    private TypeAddress typeAddress;
    private String country;
    private String city;
    private String street;
    private boolean useFlag;

    public TypeAddress getTypeAddress() {
        return typeAddress;
    }

    public void setTypeAddress(TypeAddress typeAddress) {
        this.typeAddress = typeAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public boolean isUseFlag() {
        return useFlag;
    }

    public void setUseFlag(boolean useFlag) {
        this.useFlag = useFlag;
    }

    @Override
    public String toString() {
        return "Address - " + "Type address: " + typeAddress +
                ". Country: " + country + ", city: " + city + ", street: " + street;
    }
}
