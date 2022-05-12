package com.company;

public class Singer extends Person {
    private String bandName;

    public Singer(String name,String designation,String bandName){
        super(name,designation);
        this.bandName=bandName;
    }

    @Override
    public String toString() {
        return "\nSinger name: "+getName()+"\nSinger designation: "+getDesignation()+"\nSinger company name: "+getBandName();
    }
    static void learn(){
        System.out.println("singer is learning");

    }
    static void walk(){
        System.out.println("singer is walking");
    }
    static void eat(){
        System.out.println("singer is eating");
    }

    static void singing(){
        System.out.println("singer is singing");

    }
    static void playGuitar(){
        System.out.println("and playing a guitar ");

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
