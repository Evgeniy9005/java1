package Lip.progwards.ev;

public class HelloWorld {
    static int addition(int x, int y){
        return x+y;
    }
    static double fractional(double num){
        double result1=num+1.0;
        double result=result1 / result1;
        return result1 % result;
    }

    public static void main(String[] args){
        System.out.println("Hello World! \"Привет Мир\"");
        float pi=3.1415926535f;
        double koe =15;
        double d1 = 5 / 2;
        double d2 = 5.234 % 2;
        String  message = "Запись фильма \"Матрица\" находится в файле C:\\video\\matrix.avi";
        System.out.println(d2);
        System.out.println(fractional(1.5));
    }

}
