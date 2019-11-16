package ru.progwards.java1.lessons.classes;

public class Animal {
     enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK}
     enum FoodKind {
       UNKNOWN,
        HAY,
        CORN}
    Animal() {

    }

    public AnimalKind getKind(){
    return AnimalKind.ANIMAL;
    }
    public FoodKind getFoodKind(){
       return FoodKind.UNKNOWN;
    }
    @Override
    public String toString(){
       return "I am "+ AnimalKind.ANIMAL+ ", eat "+FoodKind.UNKNOWN;
    }
    public static void main(String[] args) {
        Animal animal=new Animal();
        System.out.println(animal.getKind());
        System.out.println(animal.getFoodKind());
        System.out.println(animal.toString());
    }
}
