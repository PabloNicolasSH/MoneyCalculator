package moneycalculator.persistence.impl;

import moneycalculator.model.Currency;
import moneycalculator.persistence.CurrencyLoader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CurrencyLoaderImpl implements CurrencyLoader {

    private final File file = new File("src/moneycalculator/currencies.txt");

    @Override
    public List<Currency> loadCurrencies() {
        List<Currency> currencies = new ArrayList<>();
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String[] data = reader.nextLine().split(", ");
                currencies.add(Currency.of(data[1], data[0], data[2]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return currencies;
    }
}
