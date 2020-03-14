package ru.progwards.java1.lessons.interfaces;

public class Cow extends Animal{

    public Cow (double weight){
        super(weight);

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
    // Возвращает необходимый вес еды к весу тела животного
    public double calculateFoodWeight(){
        return weight*getFoodCoeff();
    }
    public static void main(String[] args) {
        Cow cow=new Cow(300);
        System.out.println(cow.getFoodKind());
        System.out.println(cow.getFoodCoeff());
        System.out.println("Количество еды "+cow.calculateFoodWeight());
        System.out.println("Вес коровы "+cow.weight);
        System.out.println(cow.compareFoodPrice(cow));

    }
}
