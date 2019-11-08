package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    //Возвращает объём шара с радиусом radius и основана на типе double 4/3πR3.
    public static double volumeBallDouble(double radius){
        return 4d/3d*3.14d*(radius*radius*radius);
    }
    //Возвращает объём шара с радиусом radius и основана на типе float 4/3πR3.
    public static float volumeBallFloat(float radius){
        return 4f/3f*3.14f*(radius*radius*radius);
    }
    public static double calculateAccuracy(double radius){
        String s1= Double.toString(radius);
        float f1=Float.parseFloat(s1);
        return volumeBallDouble(radius)-volumeBallFloat(f1);
    }
    public static void main(String[] args) {
        //Выводит значение объема Земли в формате double
        System.out.print("Выводит значение объема Земли в формате double ");
        System.out.println(volumeBallDouble(6371.2));
        //Выводит значение объема Земли в формате float
        System.out.print("Выводит значение объема Земли в формате float ");
        System.out.println(volumeBallFloat(6371.2f));
        //Выводит разницу между функциями volumeBallDouble и volumeBallFloat
        System.out.print("Возвращать разницу между функциями volumeBallDouble и volumeBallFloat ");
        System.out.println(calculateAccuracy( 6371.2));
    }
}
