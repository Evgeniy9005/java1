package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger{
    byte value;
    ByteInteger(int value){
        this.value=(byte) value;
    }

    @Override
    public String toString(){
        System.out.println(value);
        return "";
    }
    public static void main(String[] args) {
        ByteInteger byteInteger=new ByteInteger(127);
        System.out.println(byteInteger.add((byte)127,(byte)127));
        byteInteger.toString();
    }
}
