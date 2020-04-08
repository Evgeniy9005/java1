package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger {
    int value;
    IntInteger(int value){
        this.value= value;
    }

    @Override
    public String toString(){
        System.out.println(value);
        return "";
    }
    public static void main(String[] args) {
        IntInteger intInteger=new IntInteger(10);
        System.out.println(IntInteger.add( 10,10));
        intInteger.toString();
    }
}
