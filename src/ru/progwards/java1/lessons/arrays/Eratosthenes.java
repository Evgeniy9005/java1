package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    int n;
    int [] arrayInt;
    Eratosthenes(int n) {
        //Инициализация переменных
        this.n = n;
        arrayInt = new int[n - 1];
        int i;
        int i1;
        int p = 2;
        //Вписывает подряд все целые числа от двух до n (2, 3, 4, …, N).
        for (i = 1; i < n; i++) {
            arrayInt[i - 1] = i + 1;
        }
        for (int i2=0;i2!=n-1;i2++) {
            System.out.println(p);
            // Обнуление счетчика для следующей работы
            i = 0;
            //Цыкл переберает элементы масива
            while (i != n - 1) {
                i1 = arrayInt[i];
                //Цыкл выберает числа кратные p
                while (i1 >= p && i1!=0) {
                    i1 -= p;
                    if (i1 == 0 ) arrayInt[i] = 0;
                }
                i++;// счетчик элементов массива
            }
            System.out.println(Arrays.toString(arrayInt));
            p=oneInArray(p,arrayInt);// В
        }
    }

    // Нанаходит первое незачёркнутое число в списке, большее чем p, и присвоить значению переменной p это число.
    private int oneInArray(int p, int[]arrayInt){
        int i=0;
        while (arrayInt[i]<p && arrayInt.length-1>i) {
            i++;
        }
        p=arrayInt[i];
        return p;
    }

    //Выводит на экран массив
    @Override
    public String toString(){
        System.out.println(Arrays.toString(arrayInt));
        return "";
    }

    public static void main(String[] args) {
        int p=2;
      //  int[] a={0,3,0,5,0,7,0,9,0,11};
        Eratosthenes eratosthenes=new Eratosthenes(11);
        eratosthenes.toString();
       //System.out.println(eratosthenes.oneInArray(p,a));
        System.out.println(13%3);
    }


}
