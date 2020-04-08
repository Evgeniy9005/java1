package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger{
    byte value;
    ByteInteger(byte value){
        this.value= value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
    public static void main(String[] args) {
        ByteInteger byteInteger=new ByteInteger((byte) 127);
        System.out.println(byteInteger.add(new ByteInteger((byte)11),new ByteInteger((byte)11)));
        System.out.println(byteInteger.getClass());
        System.out.println(byteInteger.toString());
    }
}
