package ru.progwards.java1.lessons.interfaces;
import java.util.Arrays; //??????????
public class ArraySort implements CompareWeight {

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
        ArraySort arraySort =new ArraySort();
        Duck duck=new Duck(3);
        Cow cow=new Cow(300);
        Hamster hamster=new Hamster(0.2);
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
