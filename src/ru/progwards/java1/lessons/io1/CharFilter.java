package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class CharFilter {
    public static void filterFile(String inFileName, String outFileName, String filter) throws IOException{
        String str ="";//строка для получения данных из файла
        String outStr="";//строка для вывода оредоктированной строки
//чтение файла и запись в строку для дальнейшей работы
            FileReader reader=new FileReader (inFileName);
            try{
                Scanner scanner = new Scanner(reader);
                while (scanner.hasNextLine()) {
                    str=str+scanner.nextLine();
                }
              //  System.out.println(" str= "+str+" символов str="+str.length());
            }finally {
                reader.close();
            }
//цыкл выбирает и вычеркивает из строки указаные в перменной filter символы, и записывет в новую строку
        for(int i=0;i<filter.length();i++) {
            for (int ii = 0; ii < str.length(); ii++) {
                if (filter.charAt(i)==str.charAt(ii)) str=str.replace(str.charAt(ii),' ');
                if (i==filter.length()-1 && str.charAt(ii)!= ' ') outStr=outStr+str.charAt(ii);
            }
        }
//создает файл и записывает в него полученную выходную строку
        FileWriter fileWriter = new FileWriter(outFileName, false); //Если false то пишет строку заново, если true продолжает писат файл
              try {
                    fileWriter.write(outStr );
               } finally{
                    fileWriter.close();
                }
        //System.out.println(">>>> "+str);
        //System.out.println(">>>>> "+outStr);
    }

    public static void main(String[] args) {
        try {
            filterFile("inFileName.text", "outFileName.text", " ");
        }catch (IOException e) {
            System.out.println("Проброшенное исключение "+e.getMessage());
        }
    }
}
