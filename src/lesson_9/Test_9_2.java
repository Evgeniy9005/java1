package lesson_9;

import java.io.IOException;

public class Test_9_2 {
    public String test(String filename)throws IOException {
        if (filename == null) throw new IOException("File not found");
        else return "File processing";
    }

    public static void main(String[] args) {
        Test_9_2 test_9_2 =new Test_9_2();
        try {
            System.out.println(test_9_2.test(null));
        }catch (IOException e) {
            System.out.println("dfhsjk");
            System.out.println();
        }
    }
}
