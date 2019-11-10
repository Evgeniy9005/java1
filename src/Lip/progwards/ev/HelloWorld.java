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
    static int addAsStrings(int n1, int n2){
        String s1=Integer.toString(n1)+Integer.toString(n2);
       // s1=s1+Integer.toString(n2);

        return Integer.parseInt(s1);
    }

    static String textGrade(int grade){
        String s1=" ";
        if (grade==0) s1="не оценено";
        if (grade>=1 && grade<=20 )s1="очень плохо";
        if (grade>=21 && grade<=40 )s1="плохо";
        if (grade>=41 && grade<=60 )s1="удовлетворительно";
        if (grade>=61 && grade<=80 )s1="хорошо";
        if (grade>=81 && grade<=100 )s1="отлично";
        if (grade>100 || grade<0 )s1="не определено";
        return s1;
    }
    //Вычисление факториала
    static int factorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++) {fact*=i;
        System.out.println("Номир итерации " +i);}

        return fact;
    }
    public static void main(String[] args){
        System.out.println("Hello World! \"Привет Мир\"");
        float pi=3.1415926535f;
        double koe =15;
        double d1 = 5 / 2;
        double d2 = 5.234 % 2;
        String  message = "Запись фильма \"Матрица\" находится в файле C:\\video\\matrix.avi";
        System.out.println(d2);
        System.out.println(fractional(1.56876));
        System.out.println(message);
        System.out.println(addAsStrings(9000, 6768));
        if (3-1>2) System.out.println("3-1>2 истина");
        else System.out.println("3-1>2 лож");
        if (7*7==47) System.out.println("7*7=47 истина");
        else System.out.println("7*7=47 лож");
        if (5*5<=25) System.out.println("5*5<=25 истина");
        else System.out.println("5*5<=25 лож");
        System.out.println(textGrade(70));
        //Вычисление факториала T3.3 Тест блока 3
        System.out.println(factorial(4));
    }

}
