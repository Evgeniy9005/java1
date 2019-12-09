package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;

public class ArraySort {
    //Метод сортерует массив целых чисел от меньшего к большему
    public static void sort(int[] a){
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

    public static void main(String[] args) {
        int[] a={2,10,5,3,2,7,9,4,6};
        ArraySort arraySort =new ArraySort();
        arraySort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
