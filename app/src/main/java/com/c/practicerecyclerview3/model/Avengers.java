package com.c.practicerecyclerview3.model;

public class Avengers {
String name;
String power;
String location;
String position;

    public Avengers(String name, String power, String location, String position) {
        this.name = name;
        this.power = power;
        this.location = location;
        this.position = position;
    }

    public Avengers(){}

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
