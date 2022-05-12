package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name,String designation,String groupName){
        super(name,designation);
        this.groupName=groupName;
    }
    public Dancer(){

    }

    @Override
    public String toString() {
        return "\nDancer name: "+getName()+"\nDancer designation: "+getDesignation()+"\nDancer company name: "+getGroupName();
    }
    static void learn(){
        System.out.println("dancer is learning");
    }
    static void walk(){
        System.out.println("dancer is walking");
    }
    static void eat(){
        System.out.println("dancer is eating");
    }
    static void dancing(){
        System.out.println("dancer is dancing");
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
