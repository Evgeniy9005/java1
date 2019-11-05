package ru.progwards.java1.lessons.helloworld;

public class Task3 {

    public static int addition(int x,int y){
        System.out.println("Вызвана функция addition()");
        return x+y; // Возвращает значение суммы x+y
    }
    public static int subtraction(int x,int y){
        System.out.println("Вызвана функция subtraction()");
        return x-y; // Возвращает значение разнецы x-y
    }

    public static int multiplication(int x, int y){
        System.out.println("Вызвана функция multiplication()");
        return x*y; // Возвращает значение произведения x*y
    }

    public static void main(String[] args){
        int a,b,c;
        a=34;
        b=55;
        System.out.print("a=");
        System.out.println(a);
        System.out.print("b=");
        System.out.println(b);
        //Вывод суммы a+b
        c=addition(a,b);
        System.out.print("a+b=");
        System.out.println(c);
        //Вывод разности a-b
        c=subtraction(a,b);
        System.out.print("a-b=");
        System.out.println(c);
        //Вывод произведения a*b
        c=multiplication(a,b);
        System.out.print("a*b=");
        System.out.println(c);

    }
}
