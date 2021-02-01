package com.c.practicerecyclerview3.model;

public class DC {
    String hero_name;
    String name;
    String power;
    String image;

    public DC(String hero_name, String name, String power, String image) {
        this.hero_name = hero_name;
        this.name = name;
        this.power = power;
        this.image = image;
    }

    public String getHero_name() {
        return hero_name;
    }

    public void setHero_name(String hero_name) {
        this.hero_name = hero_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
