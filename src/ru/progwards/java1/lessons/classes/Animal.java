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
      double weight;
    Animal(double weight) {
    this.weight=weight; //Запоминает вес тела животного
    }
    //Возврашает вид животного
    public AnimalKind getKind(){
    return AnimalKind.ANIMAL;
    }
    //Возврашает вид еды животного
    public FoodKind getFoodKind(){
       return FoodKind.UNKNOWN;
    }
    //Выдодит на экран вид животного и корм для этого животного
    @Override
    public String toString(){
       //return "I am "+ AnimalKind.ANIMAL+ ", eat "+FoodKind.UNKNOWN;
        return "I am "+ AnimalKind.ANIMAL+ ", eat "+FoodKind.UNKNOWN+" "+CalculateFoodWeight();
    }
    // Возвращает вес животного
    public double getWeight(){
        return 1d;
    }
    // Возвращает коэффициент веса еды к весу тела животного
    public double getFoodCoeff(){
        return 0.02;
    }
    // Возвращает необходимый вес еды к весу тела животного
    public double CalculateFoodWeight(){
        return weight*getFoodCoeff();
    }

    public static void main(String[] args) {
        Animal animal=new Animal(300d);
        System.out.println(animal.getKind());
        System.out.println(animal.getFoodKind());
        System.out.println(animal.getWeight());
        System.out.println(animal.getFoodCoeff());
        System.out.println(animal.toString());

    }
}
