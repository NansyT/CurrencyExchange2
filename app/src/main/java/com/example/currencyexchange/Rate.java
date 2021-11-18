package com.example.currencyexchange;

/**
 * Class for rate.
 *
 * This class is used so we can get rate objects
 *
 * @author Nanna
 * @version 1.0
 * @since 2.0
 */
public class Rate {
    public String name;
    public double spotRate;

    public Rate(String name, double rate) {
        this.name = name;
        this.spotRate = rate;
    }
}
