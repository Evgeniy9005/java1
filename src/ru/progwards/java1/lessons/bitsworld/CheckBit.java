package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    // Возвращает порядковый номер бита в байте числа
    public static int checkBit(byte value, int bitNumber){
        int i=-1,b;
        byte value1=-1;
        int result=0;
        do{
           b=value&1;
            i++;
            if (i==bitNumber) result=b;
            value>>=1;
            value1<<=1;
        }while(value1!=0 );
        return result;
    }
    public static void main(String[] args) {
        System.out.println(checkBit((byte)-1,0));
    }
}
