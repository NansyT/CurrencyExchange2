package com.example.currencyexchange;
/**
 * Class for converted currency.
 *
 * This class is used so we can get converted currencies objects
 *
 * @author Nanna
 * @version 1.0
 * @since 2.0
 */
public class ConvertedCurrency {
    public String name;
    public String amount;

    public ConvertedCurrency(String name, String amount) {
        this.name = name;
        this.amount = amount;
    }
}
