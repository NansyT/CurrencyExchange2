package com.example.currencyexchange;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Class for CurrencyAdapter.
 *
 * This class is used so we can get currencyAdapter object
 *
 * @author Nanna
 * @version 1.0
 * @since 2.0
 */
public class CurrencyAdapter extends ArrayAdapter<ConvertedCurrency> {
    public CurrencyAdapter(Context context, ArrayList<ConvertedCurrency> currencies) {
        super(context, 0, currencies);
    }

    /**
     * Method to get the view
     *
     * This gets the view that displays data at a specified position in data set
     *
     * @param position The position of the item in adapters data set of the item whose view we want
     * @param convertView The old view to reuse, if possible
     * @param parent The parent this view will eventually get attached to
     * @return The view to the data at the specified position
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Get data item for this position
        ConvertedCurrency currency = getItem(position);

        //Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.currency_list, parent, false);
        }

        //Lookup view for data population
        TextView currencyName = (TextView) convertView.findViewById(R.id.currenccy_name);
        TextView currencyAmount = (TextView) convertView.findViewById(R.id.currenccy_amount);

        //Populate the data into the template view using the data object
        currencyName.setText(currency.name);
        currencyAmount.setText(currency.amount);

        //return the completed view to render on screen
        return convertView;
    }
}
