package com.company;

import java.sql.SQLOutput;

public class Trade {
    public String ID,symbol;
    public int quantity;
    public double price;

    public Trade(String name, String symbol, int quantity, double price) {

        this.ID = name;
        this.symbol=symbol;
        this.quantity=quantity;
        this.price=price;
    }

    public void setPrice(double price) {
        if(price >= 0){
            this.price = price;
        }else{
            System.out.println("This can not happen because of negative value");
        }

    }

    public String toString(){

        System.out.println(ID);
        System.out.println(symbol);
        System.out.println(quantity);
        System.out.println(price);

        return null;
    }
}
