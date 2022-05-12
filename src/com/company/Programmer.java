package com.company;

public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }
    public Programmer(){

    }


    @Override
    public String toString() {
        return "Programmer name: "+getName()+"\nProgrammer designation: "+getDesignation()+"\nProgrammer company name: "+getCompanyName();

    }
    static void learn(){
        System.out.println("programmer is learning");
    }
    static void walk(){
        System.out.println("programmer is walking");
    }
    static void eat(){
        System.out.println("programmer is eating");
    }
    static void codding(){
        System.out.println("programmer is codding ");

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        companyName = companyName;
    }
}
