package ru.progwards.java1.lessons.helloworld;

public class Task1 {
    public static void main(String[] args){
        String str1="Хорошо идут дела";
        String str2="Изучаю Java я!";
        String str3=" ";
        //Хорошо идут дела
        System.out.println(str1);
        //Изучаю Java я!
        System.out.println(str2);
        //Хорошо идут дела Изучаю Java я!
        System.out.print(str1);
        System.out.print(str3);
        System.out.println(str2);
        //Изучаю Java я! Хорошо идут дела
        System.out.print(str2);
        System.out.print(str3);
        System.out.print(str1);

    }

}
