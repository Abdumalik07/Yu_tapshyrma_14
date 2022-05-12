package com.company;

public class Person {
    private String name;
    private String designation;



    public Person(String name,String designation){
        this.name=name;
        this.designation=designation;

    }
    public Person(){

    }

    @Override
    public String toString() {
        return "Person name: " + name  + "\nPerson designation: " + designation;
    }


    static void learn(){
        System.out.println("Person is learning");

    }
    static void walk(){
        System.out.println("Parson is walking");

    }
    static void eat(){
        System.out.println("Parson is eating");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
