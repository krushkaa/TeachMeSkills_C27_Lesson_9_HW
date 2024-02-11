package com.teachmeskills.lesson9.task3.service;

import com.teachmeskills.lesson9.task3.constant.CommissionConsts;
import com.teachmeskills.lesson9.task3.constant.CurrencyCodeConstants;
import com.teachmeskills.lesson9.task3.constant.CurrencyExchangeConsts;
import com.teachmeskills.lesson9.task3.model.card.BasicCard;
import com.teachmeskills.lesson9.task3.model.client.Client;

import java.util.Scanner;


public class TransferService {
    public void transferFromCardToCard(Client client, BasicCard card, BasicCard card2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first card code: ");
        int card1ID = scanner.nextInt();
        System.out.println("Enter the second card code: ");
        int card2ID = scanner.nextInt();
        System.out.println("Enter the amount: ");
        double value = scanner.nextDouble();
        if ((card.getCurrencyCode() == card1ID) || (card2.getCurrencyCode() == card2ID)) {
            if (card.checkTransferLimit() && card2.checkTransferLimit()) {
                System.out.println("Client name and surname: " + client.getName() + " " + client.getSurname());
                System.out.println("Client amount of cards: " + client.getCards().length);
                System.out.println("First card value before transfer: " + card.getCurrentBalance());
                System.out.println("Second card value before transfer: " + card2.getCurrentBalance());
                System.out.println("Bank commission: " + value * CommissionConsts.BANK_COMMISSION);
                card.setCurrentBalance(card.getCurrentBalance() - (value + (value * CommissionConsts.BANK_COMMISSION)));
                System.out.println("First card value after transfer: " + card.getCurrentBalance());
                System.out.println("Second card value after transfer: " + card2.getCurrentBalance());
            } else {
                System.out.println("One of the cards doesn't pass limit verification!");
            }

        } else {
            System.out.println("Error!");
        }
        scanner.close();
    }
}

