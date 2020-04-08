package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;
//---------------------------------\\
public class BigAlgebra {
//Метод возводит в степень дробное число с помощью алгоритма быстрого возведения в степень Аль-Каши
 public static BigDecimal fastPow(BigDecimal num, int pow){
BigDecimal num1;
int pow1=2;
int b=pow%2;
        pow = pow / 2;
        num1=num.pow(b);
     b=pow%2;
     pow = pow / 2;
     num1=num1.multiply(num.pow(2*b));
do {
    b = pow % 2;
    pow = pow / 2;
    if (b==1) num1=num1.multiply(num.pow(2*pow1));
    pow1=pow1+pow1;
}while (pow!=0);
        return num1;
    }

//---------------------------------\\
 //   Метод вычисляет n-е число фибоначчи в BigInteger.
     static BigInteger fibonacci(int n){
            BigInteger fibo=BigInteger.valueOf(0);
         int i=0;
         BigInteger n1=BigInteger.valueOf(0);
         do {
             fibo=fibo.add(n1);
             n1=fibo.subtract(n1);
             i++;
             if (fibo.compareTo(BigInteger.valueOf(0))==0) fibo=BigInteger.valueOf(1);
         }while (i!=n);
            return fibo;
    }

    public static void main(String[] args) {
BigAlgebra bigAlgebra=new BigAlgebra();
     System.out.println(bigAlgebra.fastPow(BigDecimal.valueOf(2),100));
        System.out.println(fibonacci(10));
    }
}
