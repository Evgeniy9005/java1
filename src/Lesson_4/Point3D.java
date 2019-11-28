package Lesson_4;

public class Point3D extends Point2D {
    private int z;
    public Point3D(int x,int y,int z){
    super(x, y);
    this.z=z;
    }
    @Override
    public String toString(){
       super.toString();
        String xyz=Integer.toString(z);
        xyz=super.toString()+","+xyz;
        return xyz;
    }

    public static void main(String[] args) {
        Point3D point3D=new Point3D(23,12,25);
        System.out.println(point3D.toString());
    }
}
