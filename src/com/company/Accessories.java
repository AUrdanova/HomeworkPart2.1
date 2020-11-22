package com.company;

public class Accessories extends NewClothes {
    private String name;
    private int size;
    private  String madeCountry;

    public Accessories(String name,int size,String madeCountry, Material material, Color color,String brand){
        super(brand, material, color);
        this.name = name;
        this.size = size;
        this.madeCountry = madeCountry;
    }

    public  String info(){
      return "name: "+name + ", size: "+size + ", madeCountry: "+madeCountry+", Material composition: "+super.getMaterial().getComposition()+", material lifetime: "+super.getMaterial().getLifeTime()+", color: "+super.getColor()+", Brand: "+super.getBrand();
    }
    public void print(){
        System.out.println("animal print: \uD83D\uDC5C");
    }
    public final void makevoice(String shrp){
        System.out.println(shrp);
    }
    public final void makevoice(int i,String shrp){
        for (int j = 0; j < i; j++) {
            System.out.println(shrp);

        }
    }
    public final void makevoice(int i,String shpr,String shrp){
        for (int j = 0; j < i; j++) {
            System.out.println(shpr+shrp);
        }
    }


    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getMadeCountry() {
        return madeCountry;
    }

}
