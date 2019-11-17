package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a;
    int b;
    //Инициализирует комплексное число
    public ComplexNum(int a, int b){
    this.a=a;
    this.b=b;
    }
    //Приведение к строке, выдать в формате a+bi, например, при a=1 и b=56 должно быть выдано 1+56i
    @Override
    public String toString(){
        return a+"+"+b + "i";
    }
    //Сложение комплексных чисел по формуле:
    // (a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNum add(ComplexNum num1, ComplexNum num2) {
        ComplexNum sum =new ComplexNum(num1.a,num1.b);
        sum.a =(num1.a+num2.a);
        sum.b=(num1.b+num2.b);
        return sum;
    }
    //Вычитание комплексных чисел по формуле:
    //(a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNum sub(ComplexNum num1, ComplexNum num2){
        ComplexNum dif =new ComplexNum(num1.a,num1.b);
        dif.a=(num1.a-num2.a);
        dif.b=(num1.b-num2.b);
        return dif;
    }
    //Умножение комплексных чисел по формуле:
    //(a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
    public ComplexNum mul(ComplexNum num1, ComplexNum num2){
        ComplexNum mul =new ComplexNum(num1.a,num1.b);
        mul.a=num1.a*num2.a-num1.b*num2.b;
        mul.b=num1.b*num2.a+num1.a*num2.b;
        return mul;
    }
    //Деление комплексных чисел по формуле:
    //(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    public ComplexNum div(ComplexNum num1, ComplexNum num2){
        ComplexNum div=new ComplexNum(num1.a,num1.b);
        div.a=(num1.a*num2.a+num1.b*num2.b)/(num2.a*num2.a+num2.b*num2.b);
        div.b=(num1.b*num2.a-num1.a*num2.b)/(num2.a*num2.a+num2.b*num2.b);
    return div;
    }
    public static void main(String[] args) {
        //Создание объектов
        ComplexNum complexNum1=new ComplexNum(1000,1000);
        ComplexNum complexNum2=new ComplexNum(100,100);
        //Вывод на экран комплексного числа
        System.out.println(complexNum1.toString());
        //Вывод суммы комплексных чисел
        System.out.println(complexNum2.add(complexNum1,complexNum2).toString());
        //Вывод на экран вычитания комплексных чисел
        System.out.println(complexNum2.sub(complexNum1,complexNum2).toString());
        //Вывод на экран произведения комплексных чисел
        System.out.println(complexNum2.mul(complexNum1,complexNum2).toString());
        //Вывод на экран деления комплексных чисел
        System.out.println(complexNum2.div(complexNum1,complexNum2).toString());
    }
}
