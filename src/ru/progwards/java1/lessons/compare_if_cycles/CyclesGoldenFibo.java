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

        double besis=0.0;
        boolean result=false;
        if (a==b || a==c ||b==c ) {
            if (a==b) besis=(double)a/c;
            // Выражение вычисляет длину основания равнобедренного треугольник при равных сторонах a=b
            if (b==c) besis=(double)b/a;
            // Выражение вычисляет длину основания равнобедренного треугольник при равных сторонах b=c
            if (c==a) besis=(double)c/b;
            // Выражение вычисляет длину основания равнобедренного треугольник при равных сторонах c=a
            if (besis>=1.61703 && besis<=+1.61903)  result=true;

        }
        return result;
    }

    public static void main(String[] args) {
        // Выводит на экран числа Фибоначи от 1 до 15
        for (int i=0;i<=15;i++ )System.out.println(fiboNumber(i));
        // Выводит на экран значение сторон Золотых треугольников в диапазоне натуральных чисел от 1 до 100
        for (int i1=0;i1<=100;i1++) {for (int i=0;i<=100;i++)
            if (isGoldenTriangle(i,i1,i) == true)
                System.out.println("Золотой треугольник a="+i+" b="+i1+" c="+i);}
    }
}
