package ru.progwards.java1.lessons.arrays;
import ru.progwards.java1.lessons.classes.Animal;
import ru.progwards.java1.lessons.classes.Cow;
import ru.progwards.java1.lessons.classes.Duck;
import ru.progwards.java1.lessons.classes.Hamster;
import ru.progwards.java1.lessons.interfaces.CompareWeight;

import java.util.Arrays;

public class ArraySort implements CompareWeight {
    //Метод сортерует массив целых чисел от меньшего к большему
    public static void sort1(int[] a){
     int in;
        for(int i=0;i<a.length;i++){
         for (int j=i+1;j<a.length;j++){
             if (a[i]>=a[j]) {
                 in=a[j];
                 a[j]=a[i];
                a[i]=in;}
             }
         }
     }
    // Возвращает
    @Override
    public double getWeight(){return 1.1;}
    // Сравнивает
    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt){
        CompareResult compareResult=null;
        return compareResult;
    }
//
public static void sort(CompareWeight[] a){
    CompareWeight in;
    a[1].getWeight();
    for(int i=0;i<a.length;i++){
        for (int j=i+1;j<a.length;j++){
            if (a[i].getWeight()>=a[j].getWeight()) {
                in=a[j];
                a[j]=a[i];
                a[i]=in;}
        }
    }
}
    public static void main(String[] args) {
        int[] a={2,10,5,3,2,7,9,4,6};
        ArraySort arraySort =new ArraySort();
        arraySort.sort1(a);
        System.out.println(Arrays.toString(a));

        Duck duck=new Duck();
        Cow cow=new Cow();
        Hamster hamster=new Hamster();
        CompareWeight[] a1={duck,cow,hamster};
        //вывод масива до сортировки
        for(CompareWeight value:a1){
            System.out.println("Значение"+value.getClass());
        }

        arraySort.sort(a1);//сортировка массива
        // вывод масива после сортировки
        for(CompareWeight value:a1){
            System.out.println("Значение "+value.getClass());
        }
    }
}
