package ru.progwards.java1.lessons.interfaces;

public class Duck extends Animal {
    public Duck(double weight){
        super(weight);
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
    // Возвращает необходимый вес еды к весу тела животного
    public double calculateFoodWeight(){
        return weight*getFoodCoeff();
    }
    public static void main(String[] args) {
        Duck duck=new Duck(3);
        System.out.println(duck.getFoodKind());
        System.out.println(duck.getFoodCoeff());
        System.out.println("Количество еды "+duck.calculateFoodWeight());
        System.out.println(duck.getFood1kgPrice());
        System.out.println(duck.getFoodPrice());
    }
}
