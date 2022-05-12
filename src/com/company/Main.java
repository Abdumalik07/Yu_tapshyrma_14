package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer=new Programmer("Abdimalik","student","Peaksoft");
        System.out.println("\n"+programmer);
        System.out.println("Action: ");
        Programmer.learn();
        Programmer.eat();
        Programmer.walk();
        Programmer.codding();
        Dancer dancer=new Dancer("Alex","dancer","Bigdance");
        System.out.println(dancer);
        System.out.println("Action: ");
        Dancer.learn();
        Dancer.eat();
        Dancer.walk();
        Dancer.dancing();
        Singer singer=new Singer("Aman","Singer","Egizder");
        System.out.println(singer);
        System.out.println("Action: ");
        Singer.learn();
        Singer.eat();
        Singer.walk();
        Singer.singing();
        Singer.playGuitar();






    }
   static void method(Person person){
       System.out.println(person);

    }
}
