package com.teachmeskills.lesson9.task3.model.card.impl;

import com.teachmeskills.lesson9.task3.model.card.BasicCard;
import com.teachmeskills.lesson9.task3.constant.CommissionConsts;
import com.teachmeskills.lesson9.task3.constant.CurrencyCodeConstants;
import com.teachmeskills.lesson9.task3.constant.LimitConsts;

public class MasterCard extends BasicCard {

    public MasterCard(long id, int cvv, double currentBalance, int currencyCode, double commissionPercentage) {
        super(id, cvv, currentBalance, currencyCode, commissionPercentage);
    }

    @Override
    public boolean checkTransferLimit() {
        return true;
    }

    public MasterCard() {
        this.currencyCode = CurrencyCodeConstants.USD_CURRENCY_CODE;
        this.commissionPercentage = CommissionConsts.MASTER_CARD_COMMISSION;
    }

    @Override
    public int getTransferLimit() {
        return LimitConsts.MASTER_CARD_LIMIT;
    }
}
