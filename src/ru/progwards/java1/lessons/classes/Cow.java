package ru.progwards.java1.lessons.classes;
// Реализация класса корова
public class Cow extends Animal {

    Cow (){

    }
    // Возвращает вид животного "Корова"
    @Override
    public AnimalKind getKind(){
       return  AnimalKind.COW;
    }
    // Возвращает вид корма "Сено", животного "Корова"
    @Override
    public FoodKind getFoodKind(){
        return  FoodKind.HAY;
    }

    public static void main(String[] args) {
        Cow cow=new Cow();
        System.out.println(cow.getKind());
        System.out.println(cow.getFoodKind());
    }
}
