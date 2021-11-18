package com.example.currencyexchange;

import java.util.ArrayList;
import java.util.List;
/**
 * Class for getting mock currency rates.
 *
 * This class provides some mock currency rates to use
 *
 * @author Nanna
 * @version 1.0
 * @since 1.0
 */
public class MockCurrency implements CurrencyDAO {

    public MockCurrency() {

    }

    /**
     * Method that provides a list of currency rates
     *
     * @param base The base to convert from
     * @return List of currency rates
     */
    @Override
    public List<Rate> getRates(String base) {
        //1 eu = 7.43 dkk
        //1 eu = 1.14 usd
        //1 eu = 0.85 gbp
        List<Rate> rates = new ArrayList<Rate>();

        rates.add(new Rate("DDK", 7.43));
        rates.add(new Rate("EUR", 1.00));
        rates.add(new Rate("USD", 1.14));
        rates.add(new Rate("GBP", 0.85));

        return rates;
    }
}
