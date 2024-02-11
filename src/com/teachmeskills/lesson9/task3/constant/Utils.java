package com.teachmeskills.lesson9.task3.constant;

import static com.teachmeskills.lesson9.task3.constant.CurrencyCodeConstants.*;
import static com.teachmeskills.lesson9.task3.constant.CurrencyExchangeConsts.*;

public class Utils {
    public static double currencyConverter(int currencyFrom, int currencyTo, double value){
        if(currencyFrom == USD_CURRENCY_CODE){
            if(currencyTo == BYN_CURRENCY_CODE){
                value *= USD_TO_BYN;
            } else if(currencyTo == EUR_CURRENCY_CODE){
                value *= USD_TO_EUR;
            }
            return value;
        } else if(currencyFrom == BYN_CURRENCY_CODE){
            if(currencyTo == USD_CURRENCY_CODE){
                value *= BYN_TO_USD;
            } else if(currencyTo == EUR_CURRENCY_CODE){
                value *= BYN_TO_EUR;
            }
            return value;
        } else if(currencyFrom == EUR_CURRENCY_CODE){
            if(currencyTo == BYN_CURRENCY_CODE){
                value *= EUR_TO_BYN;
            } else if(currencyTo == USD_CURRENCY_CODE){
                value *= EUR_TO_USD;
            }
            return value;
        } else {
            System.out.println("Incorrect data!");
            return -1;
        }
    }
}
