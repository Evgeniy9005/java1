package lesson_9;

import Test.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test_9_3 {
   //создает файл и записывает внего строку
    public static boolean WriteInFile(String msg,boolean toConsole) {
        if (toConsole) System.out.println(msg);
        try {
            FileWriter fileWriter = new FileWriter("outFileName.text", true);
            try {
                fileWriter.write(msg + "\n");
            } finally {
                fileWriter.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    return true;
    }
// метод воврашает количество строк в файле
    private int lineCount(String filename) throws IOException  {
        int i=0;
        try{
            FileReader reader=new FileReader (filename);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String str =scanner.nextLine();
                i++;
                  // System.out.println("i= "+i + " LINE= "+str);
               }
               reader.close();
        }catch (IOException e){
            throw new IOException("файл не найден");
        }

        return i;
    }

    public static void main(String[] args) {
        Test_9_3 test_9_3 =new Test_9_3();
        test_9_3.WriteInFile("line 1",true);
        test_9_3.WriteInFile("line 2",true);
        try{
            System.out.println(test_9_3.lineCount("ff.text"));
        }catch (IOException e){
            System.out.println(e+" исключение");
        }
    }
}
