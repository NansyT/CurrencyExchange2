package com.example.currencyexchange;

import java.util.ArrayList;

/**
 * Class for CurrencyPresenter.
 *
 * This class is used so we can get CurrencyPresentor object
 *
 * @author Nanna
 * @version 1.0
 * @since 2.0
 */
public class CurrencyPresenter {



    public CurrencyPresenter() {

    }

    public void setBase(String base){

    }

    /**
     * Method that request converted currencies
     *
     * This method calls the CurrencyCalculators method calculate to calculate
     * the converted currencies
     *
     * @param currency The currency we want converted
     * @param amount The currency amount
     * @return List of converted currencies
     */
    public ArrayList<ConvertedCurrency> request(String currency, double amount){
        CurrencyCalculator calculator = new CurrencyCalculator();
        return calculator.calculate(currency, amount);
    }
}
