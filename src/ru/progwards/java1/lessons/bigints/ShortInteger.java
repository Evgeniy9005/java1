package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger{
    short value;
    ShortInteger(int value){
        this.value=(short) value;
    }

    @Override
    public String toString(){
        System.out.println(value);
        return "";
    }
    public static void main(String[] args) {
        ShortInteger shortInteger=new ShortInteger(11);
        System.out.println(shortInteger.add((short) 11,(short) 11));
        shortInteger.toString();
    }
}
