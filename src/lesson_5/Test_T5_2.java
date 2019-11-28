package lesson_5;

public class Test_T5_2 {
    byte value;
    int result;
   public Test_T5_2(byte value){


    }

    public static int test (byte value){
        int result=value&1;
        return result;
    }

    public static void main(String[] args) {
        byte value=0b101;
        int i=value;
        int b=0b100;
        int b1=0b101;
        String str="";
         do {
             b=i%2;
             if (i==value)b1 =b;
             i=i/2;
             str=str+b;
         }while (i!=0);
        System.out.println(test((byte)0b100000001));
    }
}
