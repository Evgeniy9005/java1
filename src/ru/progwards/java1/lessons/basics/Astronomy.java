package ru.progwards.java1.lessons.basics;

public class Astronomy {
    //Вычисляет площадь поверхности сферы радиуса R по формуле S = 4πR2.
    public static Double sphereSquare(Double r){
        double S=4*3.14*(r*r);
        return S;
    }
    //Вычисляет площадь поверхности Земли
    public static Double earthSquare(){
        final double EARTH_R= 6371.2; // в километрах
        return sphereSquare(EARTH_R);
    //Вычисляет площадь поверхности Меркурия
    }
    public static Double mercurySquare(){
        final double MERCURY_R= 2439.7; // в километрах
        return sphereSquare(MERCURY_R);
    }
    //Вычисляет площадь поверхности Юпитера
    public static Double jupiterSquare(){
        final double IUPITER_R= 71492.0; // в километрах
        return sphereSquare(IUPITER_R);
    }
    //Вычисляет отношение площадь поверхности Земли к площадь поверхности Меркурия
    public static Double earthVsMercury(){
        double S_earth =earthSquare(); // Плошадь поверхности Земли полученная от метода earthSquare()
        double S_mercury =mercurySquare(); // Плошадь поверхности Меркурия полученная от метода mercurySquare()
        return S_earth/S_mercury;
    }
    //Вычисляет отношение площадь поверхности Земли к площадь поверхности Юпитера
    public static Double earthVsJupiter(){
        double S_earth =earthSquare(); // Плошадь поверхности Земли полученная от метода earthSquare()
        double S_Jupiter =jupiterSquare(); // Плошадь поверхности Юпитера полученная от метода jupiterSquare()
        return S_earth/S_Jupiter;
    }
    public static void main(String[] args) {
        //Возвращает площадь поверхности сферы радиуса 2.4
        System.out.print("Площадь поверхности сферы радиуса 2.4, равна ");
        System.out.println(sphereSquare(2.4));
        //Возвращает площадь поверхности Земли
        System.out.print("Площадь поверхности Земли км^2, равна ");
        System.out.println(earthSquare());
        //Возвращает площадь поверхности Меркурия
        System.out.print("Площадь поверхности Меркурия км^2, равна ");
        System.out.println(mercurySquare());
        //Возвращает площадь поверхности Юпитера
        System.out.print("Площадь поверхности Юпитера км^2, равна ");
        System.out.println(jupiterSquare());
        // Отношение площади Земли к Меркурию
        System.out.print("Отношение площади Земли к плошади Меркурия, равно ");
        System.out.println(earthVsMercury());
        // Отношение площади Земли к Юпитеру
        System.out.print("Отношение площади Земли к плошади Юпитера, равно ");
        System.out.println(earthVsJupiter());
    }
}
