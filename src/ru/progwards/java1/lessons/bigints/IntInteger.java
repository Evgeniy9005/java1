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
    public static void main(String[] args) {
        IntInteger intInteger=new IntInteger(10);
        System.out.println(IntInteger.add( new IntInteger(10),new IntInteger(10)));
        System.out.println(intInteger.toString());
    }
}
