package com.example.dealer.response;

public class StockTotals {
    private Integer wheatStock;
    private Integer riceStock;
    private Integer fortifiedRiceStock;

    public StockTotals(Integer wheatStock, Integer riceStock, Integer fortifiedRiceStock) {
        this.wheatStock = wheatStock;
        this.riceStock = riceStock;
        this.fortifiedRiceStock = fortifiedRiceStock;
    }

    public Integer getWheatStock() {
        return wheatStock;
    }

    public Integer getRiceStock() {
        return riceStock;
    }

    public Integer getFortifiedRiceStock() {
        return fortifiedRiceStock;
    }
}

