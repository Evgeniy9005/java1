package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger  {
    byte value;
    ByteInteger(byte value){
        this.value= value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
    @Override
    public  AbsInteger add(AbsInteger num1, AbsInteger num2){
    ByteInteger byteInteger=new ByteInteger((byte)((int)((ByteInteger) num1).value+(int)((ByteInteger) num2).value));
        return byteInteger;
    }

    public static void main(String[] args) {
        ByteInteger byteInteger=new ByteInteger((byte) 127);
        System.out.println(byteInteger.add(new ByteInteger((byte)11),new ByteInteger((byte)11)));
        System.out.println(byteInteger.getClass());
        System.out.println(byteInteger.toString());
    }
}
