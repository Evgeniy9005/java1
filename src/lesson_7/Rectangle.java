package lesson_7;

import java.util.Objects;

public class Rectangle {
    private double a;
    private double b;
//Конструктор
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a*b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
// Сравнивает площади двух прямоугольников
    @Override
    public boolean equals(Object anObject){
        if (this==anObject) return true;
        if (anObject==null || getClass() != anObject.getClass()) return  false;
        Rectangle rectangle=(Rectangle)anObject;
        return Double.compare(rectangle.area(),area())==0;
    }


    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(2,2);
        Rectangle rectangle2=new Rectangle(2,2);
        System.out.println(rectangle1.equals(rectangle2));
    }
}
