package Test;

public class Test {
    @Override
    public String toString() {
        int num =1;
        String result = "";
        for (int i = 0; i < 8; i++){
            System.out.println(result);
            result += (num >> i) & 0b00000001;}
        return result;
    }
    public static void main(String[] args) {
        int t=0;
        Test test =new Test();
        System.out.println(test.toString());
        System.out.println("Напишите ответ от одного до четырех");
        System.out.write(t);
    }
}
