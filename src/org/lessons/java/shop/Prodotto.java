package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    int code;
    String name;
    String description;
    float price;
    float iva;
        
    public Prodotto(String name, String description, int price, int iva){
        Random rand = new Random();
        this.code = rand.nextInt(999999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public String basicPrice(){
        return "Il prezzo base esclusa l'iva " + this.price + "€";
    }

    public String priceIva(){
        return "Il prezzo inclusa l'iva è di " + (this.price + (this.price / 100 * this.iva)) + "€";
    }

    public String completedName(){
        return "Questo è il nome completo del prodotto " + this.code + "-" + this.name;
    }


}
