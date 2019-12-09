package lesson_6;

public class Test_T6_1 {
    public static int sumArrayItems(int[] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            System.out.println(a[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6};

        System.out.println(sumArrayItems(a));
    }
}
