package com.company;

public class NewClothes {

  private String brand;
  private Material material;
  private Color color;

    public NewClothes(String brand, Material material, Color color) {
        this.brand = brand;
        this.material = material;
        this.color = color;


    }

    public String getBrand() {
        return brand;
    }

    public Material getMaterial() {
        return material;
    }

    public Color getColor() {
        return color;
    }
}