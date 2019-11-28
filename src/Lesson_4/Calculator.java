package Lesson_4;

class Calculator{
    private int result;
    public Calculator(){
        result=0;
    }
    public int set(int num){
        return result=num;
    }
    public int add(int num){
        return result+=num;
    }
    public int sub(int num){
        return result-=num;
    }
    public int getResult(){
        return result;
    }

    public static void main(String[] args) {
        Calculator C=new Calculator();
       System.out.println(C.set(1));
       System.out.println(C.add(5));
       System.out.println(C.sub(312));
        System.out.println(C.getResult());
    }
}
