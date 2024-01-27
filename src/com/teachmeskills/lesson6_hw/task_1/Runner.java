package com.teachmeskills.lesson6_hw.task_1;

import com.teachmeskills.lesson6_hw.task_1.card.CreditCard;
import com.teachmeskills.lesson6_hw.task_1.service.CardTransaction;

/**
 * Runner class
 * <p>
 * creates 3 objects (cards) with fields, card number and balance.
 * <p>
 * Performs the operation of displaying information about cards.
 * <p>
 * Operations with cards
 * Charge 66 and 2 to Lady and Visa cards.
 * In the card master withdraw money 2
 * <p>
 * Performs the operation of displaying information about cards.
 */
public class Runner {
    public static void main(String[] args) {

        CreditCard ladyCard = new CreditCard("5826 1587 1571 1598", 134.8);
        CreditCard visaCard = new CreditCard("3637 1587 1571 1598", 50.0);
        CreditCard masterCard = new CreditCard("5757 5757 5755 57567", 346.3);

        CardTransaction infoLadyCard = new CardTransaction();
        infoLadyCard.getCreditCardInfo(ladyCard);
        CardTransaction infoVisaCard = new CardTransaction();
        infoVisaCard.getCreditCardInfo(visaCard);
        CardTransaction infoMasterCard = new CardTransaction();
        infoMasterCard.getCreditCardInfo(masterCard);

        CardTransaction addMoneyLadyCard = new CardTransaction();
        addMoneyLadyCard.addMoneyCreditCard(ladyCard, 66);
        CardTransaction addMoneyVisaCard = new CardTransaction();
        addMoneyVisaCard.addMoneyCreditCard(visaCard, 2);
        CardTransaction removeMoney = new CardTransaction();
        removeMoney.removeMoneyCreditCard(masterCard, 2);


        infoLadyCard.getCreditCardInfo(ladyCard);
        infoVisaCard.getCreditCardInfo(visaCard);
        infoMasterCard.getCreditCardInfo(masterCard);
    }
}