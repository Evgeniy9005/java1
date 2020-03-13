package ru.progwards.java1.lessons.interfaces;

public class Hamster extends Animal {
    public Hamster (double weight){
        super(weight);

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
    // Возвращает необходимый вес еды к весу тела животного
    public double calculateFoodWeight(){
        return weight*getFoodCoeff();
    }
    public static void main(String[] args) {
        Hamster hamster=new Hamster(0.2);
        System.out.println(hamster.getFoodKind());
        System.out.println(hamster.getFoodCoeff());
        System.out.println("Количество еды "+hamster.calculateFoodWeight());
    }
}
