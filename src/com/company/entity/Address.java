package com.company.entity;

public class Address {
    private String nameOfTheCity;
    private String street;
    private int numberOfTheHouse;
    private int numberOfTheRooom;

    public Address(String nameOfTheCity, String street, int numberOfTheHouse, int numberOfTheRooom) {
        this.nameOfTheCity = nameOfTheCity;
        this.street = street;
        this.numberOfTheHouse = numberOfTheHouse;
        this.numberOfTheRooom = numberOfTheRooom;
    }

    public String getNameOfTheCity() {
        return nameOfTheCity;
    }

    public void setNameOfTheCity(String nameOfTheCity) {
        this.nameOfTheCity = nameOfTheCity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfTheHouse() {
        return numberOfTheHouse;
    }

    public void setNumberOfTheHouse(int numberOfTheHouse) {
        this.numberOfTheHouse = numberOfTheHouse;
    }

    public int getNumberOfTheRooom() {
        return numberOfTheRooom;
    }

    public void setNumberOfTheRooom(int numberOfTheRooom) {
        this.numberOfTheRooom = numberOfTheRooom;
    }

    @Override
    public String toString() {
        return "Address{" +
                "nameOfTheCity='" + nameOfTheCity + '\'' +
                ", street='" + street + '\'' +
                ", numberOfTheHouse=" + numberOfTheHouse +
                ", numberOfTheRooom=" + numberOfTheRooom +
                '}';
    }
}
