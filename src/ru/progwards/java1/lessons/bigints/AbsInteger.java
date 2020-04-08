package ru.progwards.java1.lessons.bigints;

public abstract class AbsInteger {

    static AbsInteger add(AbsInteger num1, AbsInteger num2){

        return num1;
    }

    static byte add(ByteInteger num1, ByteInteger num2){
       int num=(int)num2.value+(int)num1.value;
        return (byte)num;
    }

    static short add(ShortInteger num1, ShortInteger num2){
        int num=(int)num2.value+(int)num1.value;
        return (short) num;
    }

    static int add(IntInteger num1, IntInteger num2){
        return num2.value+num1.value;
    }
}
