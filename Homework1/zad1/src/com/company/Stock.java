package com.company;

public class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }
    public  Stock()
    {
        setCurrentPrice(20);
        setPreviousClosingPrice(30);
    }

    public double getCurrentPrice()
    {
        return currentPrice;
    }

    public double getPreviousClosingPrice()
    {
        return previousClosingPrice;
    }

    public String getName()
    {
        return name;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public void setCurrentPrice(double currentPrice)
    {
        this.currentPrice = currentPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice)
    {
        this.previousClosingPrice = previousClosingPrice;
    }

    public  double changePercent()

    {
        return  previousClosingPrice - currentPrice;
    }
}
