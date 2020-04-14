package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger{
    short value;
    ShortInteger(short value){
        this.value= value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
    @Override
    public AbsInteger add(AbsInteger num1, AbsInteger num2){
        ShortInteger shortInteger=new ShortInteger((short) ((int)((ShortInteger) num1).value+(int)((ShortInteger) num2).value));
        return shortInteger;
    }
    public static void main(String[] args) {
        ShortInteger shortInteger=new ShortInteger((short) 11);
        System.out.println(shortInteger.add(new ShortInteger((short)12),new ShortInteger((short)12)));
        System.out.println(shortInteger.toString());
    }
}
