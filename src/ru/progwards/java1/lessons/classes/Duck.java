package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {

    public Duck(){
    super(3d);
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
    // Возвращает необходимый вес еды к весу тела животного
    public double calculateFoodWeight(){
        return weight*getFoodCoeff();
    }
    public static void main(String[] args) {
        Duck duck=new Duck();
        System.out.println(duck.getKind());
        System.out.println(duck.getFoodKind());
        System.out.println(duck.getFoodCoeff());
        System.out.println("Количество еды "+duck.calculateFoodWeight());
        duck.foodKind=FoodKind.CORN;
        System.out.println(duck.getFood1kgPrice());
        System.out.println(duck.getFoodPrice());
    }
}
