package com.company.entity;

public class Client {
    double numberOfCard;
    double moneyOnTheCard;
    String name;
    String surname;
    String phone;

    public Client(double numberOfCard, double moneyOnTheCard, String name, String surname, String phone) {
        this.numberOfCard = numberOfCard;
        this.moneyOnTheCard = moneyOnTheCard;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public double getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(double numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public double getMoneyOnTheCard() {
        return moneyOnTheCard;
    }

    public void setMoneyOnTheCard(double moneyOnTheCard) {
        this.moneyOnTheCard = moneyOnTheCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "numberOfCard=" + numberOfCard +
                ", moneyOnTheCard=" + moneyOnTheCard +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
