package com.company;


import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    Pillow pillow1 = new Pillow("Pillow1",15,20,100);
	    Pillow pillow2 = new Pillow("Pillow2",30,50,200, new Date(),500,Matherial.SATIN,200,5123);
	    Pillow pillow3 = new Pillow("Pillow3",50,30,150);
	    System.out.println(Pillow.getPillowsCount());
        System.out.println(pillow1.toString());
    }
}
