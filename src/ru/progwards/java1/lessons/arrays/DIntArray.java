package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
private int[] arrayInt=new int[0];
    DIntArray(){

    }
    //Добавляет элемент num в конец массива, при этом размер массива увеличиться на 1.
    //Размещает новый массив нужного размера, копирует в него старый,
    //и добавить в хвост элемент num.
    public void add(int num){
        arrayInt=Arrays.copyOf(arrayInt,arrayInt.length+1);
        arrayInt[arrayInt.length-1]=num;
    }
    // добавляет элемент num в позицию pos массива, при этом размер массива увеличиться на 1.
    // размещает новый массив нужного размера, копирует в него старый,
    // c учетом того, что новый элемент оказывается где-то в середине, и потом ложит в индекс pos элемент num.
    public void atInsert(int pos, int num){
        arrayInt=Arrays.copyOf(arrayInt,arrayInt.length+1);
        int i=arrayInt.length-1;
        while (i>pos) {
            arrayInt[i]=arrayInt[i-1];
            i--;
            arrayInt[i]=num;
        }
    }
    // Удаляет элемент в позиции pos массива, при этом размер массива должен уменьшиться на 1.
    // Размещает новый массив нужного размера, копирует в него старый, уже без элемента, который был в позиции pos.
    public void atDelete(int pos){
        int i=pos;
        while (i<arrayInt.length-1) {
            arrayInt[i]=arrayInt[i+1];
            i++;
        }
        arrayInt=Arrays.copyOf(arrayInt,arrayInt.length-1);
    }
    public int at(int pos){
        return arrayInt[pos];
    }

    public static void main(String[] args) {
        DIntArray dIntArray=new DIntArray();
        //2,-82,83,46,-6,-53,-89,62
        dIntArray.add(1);
        dIntArray.add(2);
        dIntArray.add(3);
        dIntArray.add(4);
        dIntArray.add(5);
        dIntArray.add(6);
        dIntArray.add(7);
        dIntArray.add(8);
        System.out.println(Arrays.toString(dIntArray.arrayInt));// текущий массив
        dIntArray.atInsert(5,8);

        System.out.println(dIntArray.at(5));
        System.out.println(Arrays.toString(dIntArray.arrayInt));
        //dIntArray.atDelete(1);
        System.out.println(dIntArray.at(1));
    }
}
