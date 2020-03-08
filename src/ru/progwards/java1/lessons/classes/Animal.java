package ru.progwards.java1.lessons.classes;

import ru.progwards.java1.lessons.bitsworld.Binary;
import ru.progwards.java1.lessons.interfaces.CompareWeight;

public class Animal implements FoodCompare, CompareWeight {
     public enum AnimalKind {
         ANIMAL,
        COW,
        HAMSTER,
        DUCK}
    public enum FoodKind {
        UNKNOWN,
        HAY,
        CORN}

      double weight; // вес тела животного
    FoodKind foodKind=FoodKind.HAY;
    public Animal(double weight) {
    this.weight=weight; //Запоминает вес тела животного
    }
    //Возврашает вид животного
    public AnimalKind getKind(){
    return AnimalKind.ANIMAL;
    }
    //Возврашает вид еды животного
    public FoodKind getFoodKind(){
       return FoodKind.UNKNOWN;
    }
    //Выдодит на экран вид животного и корм для этого животного
    @Override
    public String toString(){
       //return "I am "+ AnimalKind.ANIMAL+ ", eat "+FoodKind.UNKNOWN;
        return "I am "+ AnimalKind.ANIMAL+ ", eat "+FoodKind.UNKNOWN+" "+calculateFoodWeight();
    }
    // Возвращает вес животного
    public double getWeight(){
        return weight;
    }
    // Возвращает коэффициент веса еды к весу тела животного
    public double getFoodCoeff(){
        return 0.02;
    }
    // Возвращает необходимый вес еды к весу тела животного
    public double calculateFoodWeight(){
        return weight*getFoodCoeff();
    }

    //Возвращает информацию о цене 1 кг еды.
    public double getFood1kgPrice(){
        switch (foodKind){
            case HAY:  return 20;
            case CORN: return 50;
            case UNKNOWN: return 0;
            default: return -1;
        }
    }
    //Возвращает информацию о цене еды для данного животного по формуле calculateFoodWeight() * getFood1kgPrice()
    public double getFoodPrice(){
        return getFood1kgPrice()*calculateFoodWeight();
    }
    /*Возвращает true, если объекты равны и false если не равны по параметру - вес
    животного. При равном весе, утка все равно не равна хомяку. Обратите внимание на тип принимаемого
    параметра и подумайте над тем, что будет делать ваша программа, если в качестве параметра будет передан объект не
    являющийся экземпляром Animal. */
    @Override
    public boolean equals(Object anObject) {
        if (this==anObject) return true;
        if (anObject==null || getClass() != anObject.getClass()) return false;
        Animal animal=(Animal)anObject;
        if (animal.weight== weight) return true;
        else return false;
    }
    //Возвращает результаты сравнения цены еды для данного животного с ценой еды для другого животного, используя Double.compare;
    @Override
    public int compareFoodPrice(Animal aninal){
    return Double.compare(this.getFoodPrice(),aninal.getFoodPrice());
    }
    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt){
        CompareResult compareResult=null;
        if (this.weight<smthHasWeigt.getWeight()) compareResult=CompareResult.LESS;
        if (this.weight==smthHasWeigt.getWeight()) compareResult=CompareResult.EQUAL;
         if (this.weight>smthHasWeigt.getWeight()) compareResult=CompareResult.GREATER;
        return compareResult;
    }
    public static void main(String[] args) {
        Animal animal=new Animal(492);
        Cow cow=new Cow();// Объект карова
        Duck duck=new Duck();// Объект утка
        Hamster hamster=new Hamster();// Объект хомяк
        Binary binary=new Binary((byte)-128);// Объект не являющийся экземпляром  класса Animal
        System.out.println(animal.getKind());
        System.out.println(animal.getFoodKind());
        System.out.println(animal.getWeight());
        System.out.println(animal.getFoodCoeff());
        System.out.println("Вес еды к весу тела животного "+animal.calculateFoodWeight());
        System.out.println("Цене 1 кг еды. Animal "+ animal.getFood1kgPrice());
        System.out.println("Цене за количество еды. Animal "+ animal.getFoodPrice());
        duck.foodKind=FoodKind.CORN;
        System.out.println("Цене 1 кг еды. Duck "+ duck.getFood1kgPrice());
        System.out.println("Цене за количество еды. Duck "+ duck.getFoodPrice());
        System.out.println("Животное и животное "+animal.equals(animal));
        System.out.println("Карова и утка "+cow.equals(duck));
        System.out.println("Утка и хомяк "+duck.equals(hamster));
        System.out.println("Утка и утка "+duck.equals(duck));
        System.out.println("Утка и что-то "+duck.equals(binary));
        System.out.println("Количество еды для утки "+duck.calculateFoodWeight()+" кг");
        System.out.println("Количество еды для коровы "+cow.calculateFoodWeight()+" кг");
        System.out.println(duck.compareWeight(cow));
        System.out.println(duck.getWeight());

    }
}
