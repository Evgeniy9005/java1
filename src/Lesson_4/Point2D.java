package Lesson_4;

public class Point2D {
    private int x;
    private int y;
    Point2D(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        String xy=Integer.toString(x);
        xy=xy+","+Integer.toString(y);
        return xy;
    }

    public static void main(String[] args) {
        Point2D p=new Point2D(23,12);
        System.out.println(p.toString());
    }
}
