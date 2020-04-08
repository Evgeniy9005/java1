package ru.progwards.java1.lessons.bigints;

public abstract class AbsInteger {

    static AbsInteger add(AbsInteger num1, AbsInteger num2){

        return num1;
    }

    static byte add(byte num1, byte num2){
       int num=(int)num2+(int)num1;
        return (byte)num;
    }

    static short add(short num1, short num2){
        int num=(int)num2+(int)num1;
        return (short) num;
    }

    static int add(int num1, int num2){

        return num2+num1;
    }
}
