package ru.progwards.java1.lessons.io1;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Coder {

   // Читает файл inFileName и перекодирует его посимвольно в соответствии с заданным шифром,
   // результат записывает в outFileName. Шифр задается маcсивом char[] code, где каждому символу symbol оригинального
   // файла соответствует символ code[(int)symbol] выходного файла. В случае ошибок, в файл с именем logName выводит
   // название ошибки через метод класса Exception - getMessage()
    public  static void codeFile(String inFileName, String outFileName, char[] code, String logName){
        String str ="";
        String outStr="";

        try {
            //создает файл и записывает в него полученное исключение
            FileWriter err = new FileWriter(logName, false); //Если false то пишет строку заново, если true продолжает писат файл

//чтение файла и запись в строку
        try{
            FileReader reader=new FileReader (inFileName);
            try{
                Scanner scanner = new Scanner(reader);
                while (scanner.hasNextLine()) {
                           str=str+scanner.nextLine();
                }
            }finally {
                reader.close();
            }
        }catch (Exception e){
            try {
                err.write(e.getMessage());
            } finally {
                err.close();
            }
        }
//кодирование символов и запись в строку для записи в файл
        for(int i=0;i<str.length();i++){
            outStr=outStr+code[(int)str.charAt(i)];
        }
//создает файл и записывает в него полученную выходную строку
       try {
           FileWriter fileWriter = new FileWriter(outFileName, false); //Если false то пишет строку заново, если true продолжает писат файл
           try {
               fileWriter.write(outStr+"\n");
           } finally {
               fileWriter.close();
           }
       }catch (Exception e){
           try {
               err.write(e.getMessage());
           } finally {
               err.close();
           }
       }
    } catch (IOException e) {// Исключение записи в файла ошибки logName
        System.out.println("Ошибка записи исключения в файл " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        char[] code =new char[65536];
        code[100]=65535;
        for(int i=161;i<65536;i++){
            code[i-161]=(char) i;
        }
        int t=0;
    for(int ii=100;ii<200;ii++){
        System.out.print(code[ii]);
        t++;
        if(t==100) {t=0;
        System.out.println();}
    }
        codeFile("inFileName.text","outFileName.text",code,"logName.text");
    }
}
