package models;

public class Chien extends Animal {

    boolean isLabrador;

    public Chien(String nom, int age, boolean isLabrador) {
        super(nom, age);
        this.isLabrador = isLabrador;
    }
}
