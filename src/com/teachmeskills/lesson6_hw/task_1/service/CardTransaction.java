package com.teachmeskills.lesson6_hw.task_1.service;

import com.teachmeskills.lesson6_hw.task_1.card.CreditCard;

/**
 * CardTransaction class
 * <p>
 * create a minimum number for the product of the operation
 * <p>
 * create method addMoneyCreditCard (to add money to the card)
 * <p>
 * create method removeMoneyCreditCard (to remove money from the card)
 * <p>
 * create method getCreditCardInfo ( to call card information )
 */
public class CardTransaction {

    double minTransactionAmount = 5;

    public void addMoneyCreditCard(CreditCard creditCard, double amount) {
        if (amount < minTransactionAmount) {
            System.out.println("Minimum amount of card transaction 5 rubles");
        } else {
            creditCard.currentAccountBalance += amount;
            System.out.println("The account was credited " + amount + " current balance is equal to " + creditCard.currentAccountBalance);
        }
    }

    public void removeMoneyCreditCard(CreditCard creditCard, double amount) {
        if (creditCard.currentAccountBalance > 0 && amount > minTransactionAmount && creditCard.currentAccountBalance > amount) {
            creditCard.currentAccountBalance -= amount;
            System.out.println("The account was debited " + amount + " current balance is equal to " + creditCard.currentAccountBalance);
        } else {
            System.out.println("Minimum amount of card transaction 5 rubles");
        }

    }

    public void getCreditCardInfo(CreditCard creditCard) {
        System.out.println("Account number: " + creditCard.accountNumber + ". Card balance: " + creditCard.currentAccountBalance);
    }

}
