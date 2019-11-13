package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    // Выясняет, можно ли построить треугольник по трем сторонам
    public static boolean isTriangle(int a, int b, int c){
        boolean result=false;
        if ((a+b)>c && (c+a)>b && (c+b)>a) result=true;
        return result;
    }
    // Выясняет, является треугольник прямоугольный
    public static boolean isRightTriangle(int a, int b, int c){
        boolean result=false;
        if ((Math.pow(a,2)+Math.pow(b,2))==(Math.pow(c,2)) || (Math.pow(c,2)+Math.pow(b,2))==Math.pow(a,2) || (Math.pow(a,2)+Math.pow(c,2))==(b^2)) result=true;
        return result;
    }
    // Выясняет является треугольник равнобедренным
    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean result=false;
        if (a==b || a==c ||b==c ) result=true;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Можно построить треугольник? " + isTriangle(3,2,2));
        System.out.println("Треугольник прямоугольный? " + isRightTriangle(4,3,5));
        System.out.println("Треугольник равнобедренный? " + isIsoscelesTriangle(4,5,5));
    }

}
