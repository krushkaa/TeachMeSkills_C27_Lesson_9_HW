package com.teachmeskills.lesson9.task3.model.address;

public class ClientAddress {
    private String country;
    private String city;
    private String street;
    private int postCode;
    private int homeNum;

    public ClientAddress(String country, String city, String street, int postCode, int homeNum) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postCode = postCode;
        this.homeNum = homeNum;
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

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public int getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(int homeNum) {
        this.homeNum = homeNum;
    }
}
