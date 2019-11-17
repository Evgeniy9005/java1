package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {

    Hamster (){
        super(0.1);
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
    // Возвращает коэффициент веса еды к весу тела хомяка
    @Override
    public double getFoodCoeff(){
        return 0.03;
    }
    public static void main(String[] args) {
        Hamster hamster=new Hamster();
        System.out.println(hamster.getKind());
        System.out.println(hamster.getFoodKind());
        System.out.println(hamster.getFoodCoeff());
    }
}
