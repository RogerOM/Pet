package com.example;

public abstract class Animal {
    
    protected int legs;
    
    public Animal(int legs) {
        this.legs = legs;
    }
    
    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }
     
    //metodo eat abstracto para todos los animales
    public abstract void eat();
    
}