package org.lessons.java.shop;

public class Prodotto {

    int code;
    String name;
    String description;
    int price;
    int iva;
        
    public Prodotto(String name, String description, int price, int iva){
        double doubleRandomNumber = Math.random() * 1000;
        this.code = (int)doubleRandomNumber;
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


}
