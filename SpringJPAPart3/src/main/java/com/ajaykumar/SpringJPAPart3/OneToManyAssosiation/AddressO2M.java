package com.ajaykumar.SpringJPAPart3.OneToManyAssosiation;

import javax.persistence.Embeddable;

//Ques1.Create a class AddressM2M for Author with instance variables streetNumber, location, State.
@Embeddable
public class AddressO2M {
    private int streetNumber;
    private String location;
    private String State;

    public AddressO2M(){

    }
    public AddressO2M(int streetNumber, String location, String state) {
        this.streetNumber = streetNumber;
        this.location = location;
        State = state;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
