package com.justahead.kvantbackend.model;

import lombok.Data;

@Data
public class Upgrade {

    private String name;
    private int addAmount;
    private int price;
    private double multiplier;
    private int owned;



    public double calcPrice(){

        return price * Math.pow(multiplier, owned);
    }

    public void incrementOwned() {
        this.owned++;
    }




}
