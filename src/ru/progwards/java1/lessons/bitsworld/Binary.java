package ru.progwards.java1.lessons.bitsworld;

public class Binary {

    byte num;
    public Binary(byte num){
       this.num=num;
    }

    @Override
    //Преаброзут число байт в строку, в двоичный вид
    public String toString(){
        String s1,s2,s3,s4,s5,s6,s7,s8;
        int i;
        i = num &1;
        s1=Integer.toString(i);
        num >>= 1;
        i = num &1;
        s2=Integer.toString(i);
        num >>= 1;
        i = num &1;
        s3=Integer.toString(i);
        num >>= 1;
        i = num &1;
        s4=Integer.toString(i);
        num >>= 1;
        i = num &1;
        s5=Integer.toString(i);
        num >>= 1;
        i = num &1;
        s6=Integer.toString(i);
        num >>= 1;
        i = num &1;
        s7=Integer.toString(i);
        num >>= 1;
        i = num &1;
        s8=Integer.toString(i);

        return s8+s7+s6+s5+s4+s3+s2+s1;
    }
    public static void main(String[] args) {
        Binary binary =new Binary((byte)-128);
        //Выводит на экран байт
        System.out.println(binary);

    }
}
