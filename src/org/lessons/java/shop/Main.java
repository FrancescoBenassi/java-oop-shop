package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
     
        Prodotto patate = new Prodotto("Patate", "Molto buone", 1250, 23);

        System.out.println(patate.name);
        System.out.println(patate.description);
        System.out.println(patate.code);
        System.out.println(patate.basicPrice());
        System.out.println(patate.priceIva());
        System.out.println(patate.completedName());


    }

}
