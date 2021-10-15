package com.company;

public class Pizzatopping {

    // Sara

    @Override
    public String toString() {
        return "Pizzatopping{" +
                "tomatsauce='" + tomatsauce + '\'' +
                ", ost='" + ost + '\'' +
                ", oregano='" + oregano + '\'' +
                ", skinke='" + skinke + '\'' +
                ", bacon='" + bacon + '\'' +
                ", løg='" + løg + '\'' +
                ", champingnon='" + champingnon + '\'' +
                ", ananas='" + ananas + '\'' +
                '}' + "\n";
    }

    private String tomatsauce;
    private String ost;
    private String oregano;
    private String skinke;
    private String bacon;
    private String løg;
    private String champingnon;
    private String ananas;


    public Pizzatopping(String tomatsauce, String ost, String oregano, String skinke, String bacon, String løg, String champingnon, String ananas) {
        this.tomatsauce = tomatsauce;
        this.ost = ost;
        this.oregano = oregano;
        this.skinke = skinke;
        this.bacon = bacon;
        this.løg = løg;
        this.champingnon = champingnon;
        this.ananas = ananas;

    }

    public String getTomatsauce() {
        return tomatsauce;
    }

    public String getOst() {
        return ost;
    }

    public String getOregano() {
        return oregano;
    }

    public String getSkinke() {
        return skinke;
    }

    public String getBacon() {
        return bacon;
    }

    public String getLøg() {
        return løg;
    }

    public String getChampingnon() {
        return champingnon;
    }

    public String getAnanas() {
        return ananas;
    }

}