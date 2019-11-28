package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber){
        int b,i=-1,result=0;
        int value1=value;
        if (value<0) value1=~value1+1;// При отрицательном входном параметре
        do{
            b=value1&1;
            i++;
            if (i==bitNumber) result=b;
            value1>>=1;
        }while(value1!=0 );
        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkBit((byte)5,0));
    }
}
