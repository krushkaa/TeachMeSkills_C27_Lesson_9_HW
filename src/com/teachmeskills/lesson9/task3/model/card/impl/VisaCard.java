package com.teachmeskills.lesson9.task3.model.card.impl;

import com.teachmeskills.lesson9.task3.model.card.BasicCard;
import com.teachmeskills.lesson9.task3.constant.CommissionConsts;
import com.teachmeskills.lesson9.task3.constant.CurrencyCodeConstants;
import com.teachmeskills.lesson9.task3.constant.LimitConsts;

public class VisaCard extends BasicCard {

    public VisaCard(long id, int cvv, double currentBalance, int currencyCode, double commissionPercentage) {
        super(id, cvv, currentBalance, currencyCode, commissionPercentage);
    }

    @Override
    public boolean checkTransferLimit() {
        return true;
    }

    public VisaCard() {
        this.currencyCode = CurrencyCodeConstants.USD_CURRENCY_CODE;
        this.commissionPercentage = CommissionConsts.VISA_CARD_COMMISSION;
    }

    @Override
    public int getTransferLimit() {
        return LimitConsts.VISA_CARD_LIMIT;
    }
}
