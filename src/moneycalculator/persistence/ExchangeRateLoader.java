package moneycalculator.persistence;

import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;

public interface ExchangeRateLoader {
    ExchangeRate exchangeRateLoader(Currency from, Currency to);
}
