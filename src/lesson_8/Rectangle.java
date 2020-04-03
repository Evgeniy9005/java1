package lesson_8;

import java.math.BigDecimal;

 class Rectangle {
    public BigDecimal a;
    public BigDecimal b;
    Rectangle(BigDecimal a, BigDecimal b) {
        this.a = a;
        this.b = b;
    }
// Вычисляет площшадь прямоугольников и сравнивает и значения если они равны то выводит true иначе false
    boolean rectCompare(Rectangle r1, Rectangle r2){
        BigDecimal S1=r1.a.multiply(r1.b);
        BigDecimal S2=r2.a.multiply(r2.b);
        if (S1.compareTo(S2)==0) return true;
        else return false;
    }

    public static void main(String[] args) {
         BigDecimal a=BigDecimal.ONE;
         BigDecimal b=BigDecimal.ONE;
        Rectangle rectangle1=new Rectangle(BigDecimal.valueOf(3.3),BigDecimal.valueOf(3.3));
        Rectangle rectangle2=new Rectangle(BigDecimal.valueOf(3.3),BigDecimal.valueOf(3.3));
        System.out.println(rectangle1.rectCompare(rectangle1,rectangle2));
    }
}
