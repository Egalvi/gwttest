package com.mycompany.mywebapp.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mycompany.mywebapp.client.DelistedException;
import com.mycompany.mywebapp.client.StockPrice;
import com.mycompany.mywebapp.client.StockPriceService;

import java.util.Random;

public class StockPriceServiceImpl extends RemoteServiceServlet implements StockPriceService {

    private static final double MAX_PRICE = 100.0; // $100.00
    private static final double MAX_PRICE_CHANGE = 0.02; // +/- 2%

    public StockPrice[] getPrices(String[] symbols) throws DelistedException {
        Random rnd = new Random();
        StockPrice[] prices = new StockPrice[symbols.length];
        for (int i = 0; i < symbols.length; i++) {
            double price = rnd.nextDouble() * MAX_PRICE;
            double change = price * MAX_PRICE_CHANGE * (rnd.nextDouble() * 2f - 1f);
            prices[i] = new StockPrice(symbols[i], price, change);
        }
        return prices;
    }
}