package lesson_6;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {

        return a*b;
    }
    public int compareTo(Rectangle anRectangle){
    double ab1=this.area();
        double ab2=anRectangle.area();
        int result=20;
        if (ab1==ab2) result= 0;
        if (ab1>ab2) result= 1;
        if (ab1<ab2) result= -1;
        return result ;
    }


    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(1,2);
        Rectangle rectangle2=new Rectangle(2,2);
        Double r1=rectangle1.area();
        Double r2=rectangle2.area();
rectangle1.equals(rectangle2);
        System.out.println(rectangle1.compareTo(rectangle2));
    }
}
