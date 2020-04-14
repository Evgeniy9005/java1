package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger {
    int value;
    IntInteger(int value){
        this.value= value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
    @Override
    public AbsInteger add(AbsInteger num1, AbsInteger num2){
        IntInteger intInteger=new IntInteger(((IntInteger) num1).value+((IntInteger) num2).value);
        return intInteger;
    }
    public static void main(String[] args) {
        IntInteger intInteger=new IntInteger(10);
        System.out.println(intInteger.add( new IntInteger(10),new IntInteger(10)));
        System.out.println(intInteger.toString());
    }
}
