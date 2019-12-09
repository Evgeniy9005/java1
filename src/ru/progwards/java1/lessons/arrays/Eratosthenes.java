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
    }
    private void sift(){
        int i;
        //Заполняет массив подряд целыми числа от двух до n (2, 3, 4, …, N).
        for (i = 1; i < n; i++) {
            arrayInt[i - 1] = i + 1;
        }
        //Просеивает составные числа
        for (int p=2;p<n-1;p++){
            for(int j=2;j<n-1;j++){
                for (i=0;i<arrayInt.length;i++){
                    if (arrayInt[i]==p*j) arrayInt[i]=0;
                }
            }
        }
    }
    //Возвращает sieve[n], что бы можно было узнать, простое число n или составное
    public boolean isSimple(int n){
        for (int i=0;i!=n-1;i++){
            if (arrayInt[i]==0) sieve[i]=false;
            else sieve[i]=true;
        }
        System.out.println(Arrays.toString(sieve));
        return true;
    }
    public static void main(String[] args) {
        Eratosthenes eratosthenes=new Eratosthenes(21);
        eratosthenes.sift();
        eratosthenes.isSimple(21);
    }
}
