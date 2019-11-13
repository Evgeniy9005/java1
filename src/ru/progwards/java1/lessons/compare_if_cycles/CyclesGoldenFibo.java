package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
//Возвращает true, если десятичное представление числа number содердит цифру digit
    public static boolean containsDigit(int number, int digit){
        return true;
    }
    // Возвращает n-ое число Фибоначчи (нумерация начинается с 1, то есть при n = 3
    // должно вернуться число Фибоначчи 2, а при n = 10 число 55).
    public static int fiboNumber(int n) {
       int i=0;
       int n1=0;
       int fibo=0;
        do {
            fibo=fibo+n1;
            n1=fibo-n1;
            i++;
            if (fibo==0) fibo=1;
    }while (i!=n);
        return fibo;
    }
    // возвращать true, если треугольник со сторонами a, b, c является Золотым. Определим критерии.
    // Он должен быть равнобедренным и отношение ребра к основанию должно лежать между значениями 1.61703 и 1.61903.
    public static boolean isGoldenTriangle(int a, int b, int c){

        double besis=0d;
        boolean result=false;
        if (a==b || a==c ||b==c ) {
            if (a==b) {besis= Math.sqrt(a*a-(c/2)*(c/2));
            besis=besis/a;
            }
            // Выражение вычисляет длину основания равнобедренного треугольник при равных сторонах a=b
            if (b==c) {besis= Math.sqrt(b*b-(a/2)*(a/2));
            besis=besis/b;
            }
            // Выражение вычисляет длину основания равнобедренного треугольник при равных сторонах b=c
            if (c==a) {besis= Math.sqrt(c*c-(b/2)*(b/2));
          //  besis=a/besis;
            besis=besis/a;
            }
            // Выражение вычисляет длину основания равнобедренного треугольник при равных сторонах c=a
            if (besis>=1.61703 && besis<=1.61903)  result=true;
            System.out.println(besis);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(10));
        System.out.println(isGoldenTriangle(18,9,18));
    }
}
