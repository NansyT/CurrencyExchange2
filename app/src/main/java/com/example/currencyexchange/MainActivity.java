package com.example.currencyexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
/**
 * This is the mainActivity.
 *
 * This activity is used to display layout for the currency conversion
 *
 * @author Nanna
 * @version 1.0
 * @since 1.0
 */
public class MainActivity extends AppCompatActivity {

    TextView currencyAmount;
    List<String> bases = new ArrayList<String>();
    Spinner spinner;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currencyAmount = findViewById(R.id.editTextNumber);
        bases.add("DKK");
        bases.add("EUR");
        bases.add("USD");
        bases.add("GBP");

        spinner = findViewById(R.id.spinner2);

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, bases);
        spinner.setAdapter(itemsAdapter);

        listView = findViewById(R.id.convertedList);
    }


    /**
     * Method that runs when button is clicked
     *
     * This method gets the calculated currencies and presents them in a listview
     *
     * @param view The view
     */
    public void calculateValuta(View view){
        CurrencyPresenter presenter = new CurrencyPresenter();

        //Construct data source
        ArrayList<ConvertedCurrency> convertedCurrency = presenter.request(spinner.getSelectedItem().toString(), Double.parseDouble(currencyAmount.getText().toString()));

        //Create adapter
        CurrencyAdapter adapter = new CurrencyAdapter(this, convertedCurrency);

        //Attach adapter to the listView
        listView.setAdapter(adapter);

    }
}