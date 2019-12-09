package lesson_6;


import java.util.Arrays;

public class Test_T6_3 {
    public int arrayMax(int[] a){
        Arrays.sort(a); // сортерует масив чисел от меньшего к большему
        int[] b={};
        if (Arrays.equals(a,b))return 0;// сравнивает массивы
        return a[a.length-1];
    }

    public static void main(String[] args) {
        int [] a={1,3,4,1,3,23,34,11};
        Test_T6_3 test_t6_3=new Test_T6_3();
       System.out.println(test_t6_3.arrayMax(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,3);//Заполняет массив числом 3
        Arrays.binarySearch(a,5); // Поиск в массиве нужного элемента
    }
}
