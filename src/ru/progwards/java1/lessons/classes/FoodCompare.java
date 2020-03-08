package ru.progwards.java1.lessons.classes;

public interface FoodCompare {
    //Возвращает результаты сравнения цены еды для данного животного с ценой еды для другого животного, используя Double.compare;
    int compareFoodPrice(Animal aninal);
}
