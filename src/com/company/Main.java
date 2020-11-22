package com.company;

public class Main {

    public static void main(String[] args) {
        Accessories a = new Accessories("Birkin",34,"Made in Italy",new Material("leather",10),Color.BLACK,"Hermes");
        Shoes s =new Shoes("botinki",39,"China","Winter",2999,new Material("Dermantin",1),Color.RED,"Dr.Martin");
        Shoes k = new Shoes("krosovki",41,"USA","Spring",15000,new Material("leather",10),Color.BLUE,"Nike");
        System.out.println(a.info());
        System.out.println(s.info());
        System.out.println(k.info());
        a.makevoice("shhrrrrrp");
        s.makevoice(4,"SHHRRRP");
        k.makevoice(4,"shhhhhh","shrp");
    }
}
