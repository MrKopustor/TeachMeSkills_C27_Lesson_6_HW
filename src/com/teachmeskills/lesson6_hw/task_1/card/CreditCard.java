package com.teachmeskills.lesson6_hw.task_1.card;

/**
 * CreditCard class
 * <p>
 * create fields for card number and amount of money on the card
 * <p>
 * create a constructor with data from the fields
 */
public class CreditCard {
    public String accountNumber;
    public double currentAccountBalance;

    public CreditCard(String accountNumber, double currentAccountBalance) {
        this.accountNumber = accountNumber;
        this.currentAccountBalance = currentAccountBalance;

    }

}

