package com.company;

public class Material {
   private String composition;
   private int lifeTime;

    public Material(String composition, int lifeTime) {
        this.composition = composition;
        this.lifeTime = lifeTime;
    }

    public String getComposition() {
        return composition;
    }

    public int getLifeTime() {
        return lifeTime;
    }
}
