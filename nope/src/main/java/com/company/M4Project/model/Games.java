package com.company.M4Project.model;

public class Games {
    private double price;
    private double ESRBRating;
    private String name;
    private String studio;
    private String title;

    public Games(double price, double ESRBRating, String name, String studio, String title) {
        this.price = price;
        this.ESRBRating = ESRBRating;
        this.name = name;
        this.studio = studio;
        this.title = title;
    }
    public Games() {
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getESRBRating() {
        return ESRBRating;
    }

    public void setESRBRating(double ESRBRating) {
        this.ESRBRating = ESRBRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
