/*
Реализовать функцию которая получает параметром number трёхзначное положительное число,
а вернуть должна число в котором цифры идут в обратном порядке
(например, если на вход передаётся 123, то функция должна вернуть 321).
*/
package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int result=0;
        int num=0;
        result=number/100;// получение первого регистра
        // Получение третьего регистра
        num=number%100;
        num=number%10;
        result=num*100+result;
        //Получение второго регистра числа
        num=number%100;
        num=num/10;
        result=num*10+result;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(681));

    }
}
