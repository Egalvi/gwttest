package com.mycompany.mywebapp.client;

import java.io.Serializable;

/**
 * Created by Alekzander on 31.01.2015.
 */
public class StockPrice implements Serializable {
    private String symbol;
    private double price;
    private double change;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getChangePercent() {
        return 10.0 * this.change / this.price;
    }

    public StockPrice() {

    }

    public StockPrice(String symbol, double price, double change) {

        this.symbol = symbol;
        this.price = price;
        this.change = change;
    }
}
