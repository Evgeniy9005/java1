package ru.progwards.java1.lessons.bitsworld;

public class SumBits {


    //Выводит количества бит числа типа byte

    public static int sumBits(byte value){
        int i;
        byte value1=-1;
        int result=0;
        do{
            i=value&1;
            if (i==1) result++;
            value>>=1;
            value1<<=1;
        }while(value1!=0 );
        return result;
    }
    public static void main(String[] args) {
        //Вывод количества бит числа типа byte
        System.out.println(sumBits((byte)127));
    }
}
