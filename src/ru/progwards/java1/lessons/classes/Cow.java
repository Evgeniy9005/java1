package ru.progwards.java1.lessons.classes;
// Реализация класса корова
public class Cow extends Animal {

    Cow (){
        super(300d);
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
    // Возвращает коэффициент веса еды к весу тела коровы
    @Override
    public double getFoodCoeff(){
        return 0.05;
    }
    public static void main(String[] args) {
        Cow cow=new Cow();
        System.out.println(cow.getKind());
        System.out.println(cow.getFoodKind());
        System.out.println(cow.getFoodCoeff());
    }
}
