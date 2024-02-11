package com.teachmeskills.lesson9.task3.model.fabric;

import com.teachmeskills.lesson9.task3.model.card.BasicCard;
import com.teachmeskills.lesson9.task3.model.card.impl.BelCard;
import com.teachmeskills.lesson9.task3.model.card.impl.MasterCard;
import com.teachmeskills.lesson9.task3.model.card.impl.VisaCard;

public class CardFab {
    public static BasicCard[] createCards(){
        BasicCard card1 = new BelCard(111_111_111, 111, 1000.00, 1, 0.1);
        BasicCard card2 = new VisaCard(222_222_222, 222, 2000.00, 2, 0.2);
        BasicCard card3 = new MasterCard(111_222_333, 333, 3000, 3,0.3);
        BasicCard[] cards = new BasicCard[3];
        cards[0] = card1;
        cards[1] = card2;
        cards[2] = card3;
        return cards;
    }
}

