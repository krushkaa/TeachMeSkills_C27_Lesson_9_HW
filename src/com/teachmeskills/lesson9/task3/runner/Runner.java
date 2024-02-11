package com.teachmeskills.lesson9.task3.runner;

import com.teachmeskills.lesson9.task3.model.card.BasicCard;
import com.teachmeskills.lesson9.task3.model.client.Client;
import com.teachmeskills.lesson9.task3.model.fabric.AddressFab;
import com.teachmeskills.lesson9.task3.model.fabric.CardFab;
import com.teachmeskills.lesson9.task3.service.TransferService;

public class Runner {
    public static void main(String[] args) {
        TransferService transfer = new TransferService();
        Client client1 = new Client("Kirill", "Palianitsa", "MP1112233", "22.01.1591", AddressFab.createAddress(), CardFab.createCards());
        transfer.transferFromCardToCard(client1, client1.getCards()[0], client1.getCards()[2]);

    }
}

