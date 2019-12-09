package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    int n;
    int [] arrayInt;
    private boolean[] sieve;
    Eratosthenes(int n) {
        //Инициализация переменных
        this.n = n;
        arrayInt = new int[n - 1];
        sieve=new boolean[n-1];
    /*    int i;
        int i1;
        int p = 2;
        //Вписывает подряд все целые числа от двух до n (2, 3, 4, …, N).
        for (i = 1; i < n; i++) {
            arrayInt[i - 1] = i + 1;
        }
        for (int i2=0;i2!=n-1;i2++) {
            // Обнуление счетчика для следующей работы
            i = 0;
            //Цыкл переберает элементы масива,выбирает числа кратные p, кроме равного p и вычеркивает их
            //(обнуляет элемент массива)
            while (i != n - 1 && p!=0) {
                i1 = arrayInt[i];
                i1%=p;
                if (i1 == 0 && arrayInt[i]!=p) arrayInt[i] = 0;
                i++;// счетчик элементов массива
            }
            p=oneInArray(p,arrayInt);
        }*/
    }
    private void sift(){
        int i;
        int i1;
        int p = 2;
        //Заполняет массив подряд целыми числа от двух до n (2, 3, 4, …, N).
        for (i = 1; i < n; i++) {
            arrayInt[i - 1] = i + 1;
        }
        for (int i2=0;i2!=n-1;i2++) {
            // Обнуление счетчика для следующей работы
            i = 0;
            //Цыкл переберает элементы масива,выбирает числа кратные p, кроме равного p и вычеркивает их
            //(обнуляет элемент массива)
            while (i != n - 1 && p!=0) {
                i1 = arrayInt[i];
                i1%=p;
                if (i1 == 0 && arrayInt[i]!=p) arrayInt[i] = 0;
                i++;// счетчик элементов массива
            }
            p=oneInArray(p,arrayInt);
        }
    }
    public boolean isSimple(int n){
        for (int i=0;i!=n-1;i++){
            if (arrayInt[i]==0) sieve[i]=false;
            else sieve[i]=true;
        }
        System.out.println(Arrays.toString(sieve));
        return true;
    }
    // Нанаходит первое незачёркнутое число в списке, большее чем p, и присвоить значению переменной p это число.
    private int oneInArray(int p, int[]arrayInt){
        int i=0;
        while (arrayInt[i]<=p && arrayInt.length-1>i) {
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
        Eratosthenes eratosthenes=new Eratosthenes(21);
        eratosthenes.sift();
        eratosthenes.toString();
        eratosthenes.isSimple(21);
    }
}
