package com.teachmeskills.lesson9.task3.model.card.impl;

import com.teachmeskills.lesson9.task3.model.card.BasicCard;
import com.teachmeskills.lesson9.task3.constant.CommissionConsts;
import com.teachmeskills.lesson9.task3.constant.CurrencyCodeConstants;
import com.teachmeskills.lesson9.task3.constant.LimitConsts;


public class BelCard extends BasicCard {

    public BelCard(long id, int cvv, double currentBalance, int currencyCode, double commissionPercentage) {
        super(id, cvv, currentBalance, currencyCode, commissionPercentage);
    }

    @Override
    public boolean checkTransferLimit() {
        return true;
    }

    public BelCard() {
        this.currencyCode = CurrencyCodeConstants.BYN_CURRENCY_CODE;
        this.commissionPercentage = CommissionConsts.BEL_CARD_COMMISSION;
    }

    @Override
    public int getTransferLimit() {
        return LimitConsts.BEL_CARD_LIMIT;
    }
}
