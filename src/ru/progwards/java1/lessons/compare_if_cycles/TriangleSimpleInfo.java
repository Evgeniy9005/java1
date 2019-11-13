package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    //Возврашает наибольшее число
    public static int maxSide(int a, int b, int c){
        int result=0;
        if (a>b) result =a;// выясняет а больше b, если да то присваевает переменной result большее
        else if (b>c) result =b; // иначе, проверяет b больше с, если да то присваевает перменной result большее
        else result =c; // иначе, присваевает перменной result большее
        return result; // Возврашает результат
        /*При равенстве всех входных параметров выводится значение входной переменной "с".
        Остальные условия не выолняются кроме последнего в алгоритме*/
    }
    //Возврашает наименьшее число
    public static int minSide(int a, int b, int c){
        int result=0;
        if (a<b && a<c) result =a;// выясняет а меньше b и a меньше с если да то присваевает переменной result меньшее параметра a
        else if (b<c) result =b; // иначе, проверяет b меньше с, если да то присваевает перменной result меньшее параметра b
        else result =c; // иначе, присваевает перменной result меньшее параметра c
        return result; // Возврашает результат
        /*При равенстве всех входных параметров выводится значение входной переменной "с".
        Остальные условия не выолняются кроме последнего в алгоритме*/
    }
    public static boolean isEquilateralTriangle(int a, int b, int c){
        boolean result=false;
        if (a==b && a==c && b==c) result =true;// Сравнивает а равно б и а равно с и b равно с
        return result; // Возврашает результат
    }

    public static void main(String[] args) {
        System.out.println("Наибольшая длина стороны треугольника "+maxSide(2,4,1));
        // Выводит на экран наибольшее число из трех чисел
        System.out.println("Наименьшая длина стороны треугольника "+minSide(3,3,3));
        // Выводит на экран наименьшее число из трех чисел
        System.out.println("Равностороний? "+isEquilateralTriangle(3,3,3));
    }
}
