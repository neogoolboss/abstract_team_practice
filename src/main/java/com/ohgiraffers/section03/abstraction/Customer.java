package com.ohgiraffers.section03.abstraction;

public class Customer {

    private final ATM atm = new ATM();

    public void emptyCard() {

        atm.insertCard();

    }

    public void depositMoney() {

        atm.deposit();

    }

    public void withdrawMoney() {

        atm.withdraw();

    }

    public void removeCard() {

        atm.removeCard();

    }

}
