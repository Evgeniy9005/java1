package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineCount {
   //подсчитывает количество пустых строк в файле. В случае возникновения ошибок, возвращает -1
    public static int calcEmpty(String fileName){
        int i=0;
        try{
            FileReader reader=new FileReader (fileName);
            try{
                Scanner scanner = new Scanner(reader);
                while (scanner.hasNextLine()) {

                    String str =scanner.nextLine();
                    if (str.length()==0) i++;
                     System.out.println("i= "+i + " LINE= "+str);
                }
            }finally {
                reader.close();
            }
        }catch (IOException e){
            return -1;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(calcEmpty("filename.text"));
    }
}
