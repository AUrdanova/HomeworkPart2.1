package com.company;

public final class Shoes extends  Accessories {
    private String season;
    private int price;


    public Shoes(String name,int size, String madeCountry, String season, int price,Material material, Color color,String brand) {
        super(name,size, madeCountry,material,color,brand);
    }
    public String info(){
        return super.info()+", Season: "+season+", price: "+price;
    }

    public String getSeason() {
        return season;
    }

    public int getPrice() {
        return price;
    }

}
