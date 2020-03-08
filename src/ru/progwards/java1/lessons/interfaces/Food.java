package ru.progwards.java1.lessons.interfaces;

public class Food implements CompareWeight {

    private int weight;
    public Food(int weight) {
        this.weight=weight; //Запоминает вес тела животного
    }
// Возвращает вес животного
    @Override
    public double getWeight(){return weight;}
// Сравнивает вес еды
    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt){
        CompareResult compareResult=null;
        if (this.weight<smthHasWeigt.getWeight()) compareResult=CompareResult.LESS;
        if (this.weight==smthHasWeigt.getWeight()) compareResult=CompareResult.EQUAL;
        if (this.weight>smthHasWeigt.getWeight()) compareResult=CompareResult.GREATER;
        return compareResult;
    }

    public static void main(String[] args) {
        Food food1=new Food(5);
        Food food2=new Food(4);
        System.out.println(food1.compareWeight(food2));

    }
}
