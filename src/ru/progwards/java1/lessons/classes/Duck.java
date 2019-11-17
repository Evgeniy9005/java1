package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {

    Duck(){
    super(2);
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
    // Возвращает коэффициент веса еды к весу тела утки
    @Override
    public double getFoodCoeff(){
        return 0.04;
    }
    public static void main(String[] args) {
        Duck duck=new Duck();
        System.out.println(duck.getKind());
        System.out.println(duck.getFoodKind());
        System.out.println(duck.getFoodCoeff());
    }
}
