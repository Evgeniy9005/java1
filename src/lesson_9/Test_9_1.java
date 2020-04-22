package lesson_9;

public  class Test_9_1 {
    public Integer sqr(Integer n){
try {
n=n*n;
}catch (NullPointerException e){return -1;}
        return n;
    }

    public static void main(String[] args) {
        Test_9_1 test_9_1=new Test_9_1();
        System.out.println(test_9_1.sqr(null));
    }
}
