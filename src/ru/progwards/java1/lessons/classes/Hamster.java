package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {

    Hamster (){

    }
    // Возвращает вид животного "Хомяк"
    @Override
    public AnimalKind getKind(){
        return  AnimalKind.HAMSTER;
    }
    // Возвращает вид корма "Кукуруза", животного "Хомяк"
    @Override
    public FoodKind getFoodKind(){
        return  FoodKind.CORN;
    }

    public static void main(String[] args) {
        Hamster hamster=new Hamster();
        System.out.println(hamster.getKind());
        System.out.println(hamster.getFoodKind());
    }
}
