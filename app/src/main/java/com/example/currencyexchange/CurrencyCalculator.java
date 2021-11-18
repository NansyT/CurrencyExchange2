package com.example.currencyexchange;

import java.util.ArrayList;
import java.util.List;
/**
 * Class for calculating the currency.
 *
 * This class calculates the currency from a selected base to all the others
 *
 * @author Nanna
 * @version 1.0
 * @since 1.0
 */
public class CurrencyCalculator {
    List<Rate> mockRates = new ArrayList<>();

    public CurrencyCalculator() {
        MockCurrency mock = new MockCurrency();
        mockRates = mock.getRates("EUR");
    }

    /**
     * Method that converts a currency
     *
     * @param currency The currency we want converted
     * @param amount The currency amount
     * @return List of converted currencies
     */
    public ArrayList<ConvertedCurrency> calculate(String currency, double amount) {

        for (Rate rate: mockRates) {
            if (rate.name == currency) {
                amount = amount / rate.spotRate;
            }
        }
        ArrayList<ConvertedCurrency> values = new ArrayList<ConvertedCurrency>();

        for (Rate rate: mockRates) {
            values.add(new ConvertedCurrency(rate.name, String.format("%.2f", amount * rate.spotRate)));
        }
        return values;
    }
}
