package com.immutableclass.demo;

/*
i am creating a Address class as a mutable.
 */
/*
when i am adding a new fields it break all other class and
 this is against of design principles single responsibility principle
 */
public class Address {
    private String city;
    private String state;
    private String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;

    }

    /*
    the solution of above proble i'm creating a new constructor of address class..
     */
    public Address(Address address) {
        this(address.getCity(), address.getState(), address.country);
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


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
