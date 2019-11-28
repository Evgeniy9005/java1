package ru.progwards.java1.lessons.bitsworld;

public class SumBits {


    //Выводит количества бит числа типа byte
    public static int sumBits(byte value){
        int i;
        int value1=value;
        int result=0;
        if (value<0) value1=~value1+1;// При отрицательном входном параметре
        do{
            i=value1&1;
            if (i==1) result++;
            value1>>=1;
        }while(value1!=0 );
        return result;
    }

    public static void main(String[] args) {
        //Вывод количества бит числа типа byte
        System.out.println(sumBits((byte)5));
    }
}
