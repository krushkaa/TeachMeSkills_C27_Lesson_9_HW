package com.teachmeskills.lesson9.task3.model.client;

import com.teachmeskills.lesson9.task3.model.address.ClientAddress;
import com.teachmeskills.lesson9.task3.model.card.BasicCard;

public final class Client {
    private String name;
    private String surname;
    private String passportNumber;
    private String dateOfBirth;
    private ClientAddress address;
    private BasicCard[] cards;


    public Client(String name, String surname, String passportNumber, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Client(String name,
                  String surname,
                  String passportNumber,
                  String dateOfBirth,
                  ClientAddress address,
                  BasicCard[] cards) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.cards = cards;
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

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ClientAddress getAddress() {
        return address;
    }

    public void setAddress(ClientAddress address) {
        this.address = address;
    }

    public BasicCard[] getCards() {
        return cards;
    }

    public void setCards(BasicCard[] cards) {
        this.cards = cards;
    }
}
