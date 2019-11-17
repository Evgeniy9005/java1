package Lip.progwards.ev;

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
        return 1;
    }

    public static void main(String[] args) {
        Calculator C=new Calculator();
        System.out.println(C.set(12));
        System.out.println(C.add(12));
        System.out.println(C.sub(12));
        System.out.println(C.sub(12));
    }
}
