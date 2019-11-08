package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static final double EARTH_R= 6371.2; // в километрах
    public static final double MERCURY_R= 2439.7; // в километрах
    public static final double JUPITER_R= 71492.0; // в километрах
    //Вычисляет площадь поверхности сферы радиуса R по формуле S = 4πR2.
    public static Double sphereSquare(Double r){
        double S=4*3.14*(r*r);
        return S;
    }
    //Вычисляет площадь поверхности Земли
    public static Double earthSquare(Double d){
        return sphereSquare(d);
    //Вычисляет площадь поверхности Меркурия
    }
    public static Double mercurySquare(Double d){
        return sphereSquare(d);
    }
    //Вычисляет площадь поверхности Юпитера
    public static Double jupiterSquare(Double d){
        return sphereSquare(d);
    }
    //Вычисляет отношение площадь поверхности Земли к площадь поверхности Меркурия
    public static Double earthVsMercury(){
        double S_earth =earthSquare(EARTH_R); // Плошадь поверхности Земли полученная от метода earthSquare()
        double S_mercury =mercurySquare(JUPITER_R); // Плошадь поверхности Меркурия полученная от метода mercurySquare()
        return S_earth/S_mercury;
    }
    //Вычисляет отношение площадь поверхности Земли к площадь поверхности Юпитера
    public static Double earthVsJupiter(){
        return earthSquare(EARTH_R)/jupiterSquare(JUPITER_R);
    }
    public static void main(String[] args) {
        //Возвращает площадь поверхности сферы радиуса 2.4
        System.out.print("Площадь поверхности сферы радиуса 2.4, равна ");
        System.out.println(sphereSquare(2.4));
        //Возвращает площадь поверхности Земли
        System.out.print("Площадь поверхности Земли км^2, равна ");
        System.out.println(earthSquare(EARTH_R));
        //Возвращает площадь поверхности Меркурия
        System.out.print("Площадь поверхности Меркурия км^2, равна ");
        System.out.println(mercurySquare(MERCURY_R));
        //Возвращает площадь поверхности Юпитера
        System.out.print("Площадь поверхности Юпитера км^2, равна ");
        System.out.println(jupiterSquare(JUPITER_R));
        // Отношение площади Земли к Меркурию
        System.out.print("Отношение площади Земли к плошади Меркурия, равно ");
        System.out.println(earthVsMercury());
        // Отношение площади Земли к Юпитеру
        System.out.print("Отношение площади Земли к плошади Юпитера, равно ");
        System.out.println(earthVsJupiter());
    }
}
