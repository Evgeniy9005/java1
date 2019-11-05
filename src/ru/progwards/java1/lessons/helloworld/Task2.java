package ru.progwards.java1.lessons.helloworld;

public class Task2 {
    public static void subtraction(int x,int y){
        int z=x-y;
        System.out.print("Вызвана функция subtraction() с параметрами ");
        System.out.print("x=");
        System.out.print(x);
        System.out.print(" y=");
        System.out.println(y);
        System.out.print("Результат z= ");
        System.out.print(z);
    }

    public static void main(String[] args){
        subtraction(89,55);
    }
}
