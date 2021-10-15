package com.company;

public class Pizzatopping {

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
                ", chili='" + chili + '\'' +
                ", ananas='" + ananas + '\'' +
                ", kebab='" + kebab + '\'' +
                '}' + "\n";
    }

    private String tomatsauce;
    private String ost;
    private String oregano;
    private String skinke;
    private String bacon;
    private String løg;
    private String champingnon;
    private String chili;
    private String ananas;
    private String kebab;

    public Pizzatopping(String tomatsauce, String ost, String oregano, String skinke, String bacon, String løg, String champingnon, String chili, String ananas, String kebab) {
        this.tomatsauce = tomatsauce;
        this.ost = ost;
        this.oregano = oregano;
        this.skinke = skinke;
        this.bacon = bacon;
        this.løg = løg;
        this.champingnon = champingnon;
        this.chili = chili;
        this.ananas = ananas;
        this.kebab = kebab;
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

    public String getChili() {
        return chili;
    }

    public String getAnanas() {
        return ananas;
    }

    public String getKebab() {
        return kebab;
    }
}