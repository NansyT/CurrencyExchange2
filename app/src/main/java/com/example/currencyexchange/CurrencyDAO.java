package com.example.currencyexchange;

import java.util.List;

public interface CurrencyDAO {
    public List<Rate> getRates(String base);
}
