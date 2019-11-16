package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {
    Duck(){

    }
    // Возвращает вид птицы "Утка"
    @Override
    public AnimalKind getKind(){
        return AnimalKind.DUCK;
    }
    // Возвращает вид корма "Кукуруза", птицы "Утка"
    @Override
    public FoodKind getFoodKind(){
     return FoodKind.CORN;
    }
    public static void main(String[] args) {
        Duck duck=new Duck();
        System.out.println(duck.getKind());
        System.out.println(duck.getFoodKind());
    }
}
