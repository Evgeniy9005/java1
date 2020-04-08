package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;
import java.util.Arrays;

public class ArrayInteger {
int t=0;
    byte[] digits;
    // инициализирует класс, с максимальной точностью n цифр (размер массива)
    ArrayInteger(int n){
        this.digits=new byte[n];
    }

// устанавливает свое значение, взяв его из value
    void fromInt(BigInteger value){
  int i=0;// счетчик
  t=value.toString().length(); // запоминает число символов в строке значения для цикла
        do{
           digits[i]=value.mod(BigInteger.TEN).byteValue(); // остаток от деления, занисение в массив
            value=value.divide(BigInteger.TEN);// Деление без остатка
            i++;
  }while (i<t);
      //  System.out.println(Arrays.toString(digits)); для проверки
    }
// приводит свое значение к BigInteger
    public BigInteger toInt(){
        String str="";
        for(int i=t-1; i>-1;i--){
            str=str+digits[i];
        }
     //   System.out.println(str); для проверки
BigInteger toInt=new BigInteger(str);
        return toInt;
    }
// Складывает 2 числа, не используя BigInteger, а  используя массив digits, результат помещает в экземпляр
// ArrayInteger, у которого был вызван метод. При переполнении возврашает false, при этом само число сбрасывет в 0
    public boolean add(ArrayInteger num){
        int sum;
        for (int i=0; (i<num.t) || (i<this.t);i++ ){
            if (i>digits.length-1){ // проверка на способность вместить все элементы числа
                Arrays.fill(digits,(byte)0);// сброс массива в ноль
                return false;
            }
            sum=(int)this.digits[i]+ (int)num.digits[i];
            if (sum>9) { // проверка на натуральное число для записи в элемет массива
                digits[i]=(byte)(sum%10); // вычисляет остаток
                digits[i+1]=(byte)(digits[i+1]+1);// плюсует целое к следуюшему элементу массива(как при сложении столбиком)
            }
            else digits[i]= (byte)sum;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayInteger arrayInteger=new ArrayInteger(5);
        arrayInteger.fromInt(BigInteger.valueOf(154));
        arrayInteger.toInt(); // ввозврашает число в BigInteger
        ArrayInteger arrayInteger1=new ArrayInteger(5);
        arrayInteger1.fromInt(BigInteger.valueOf(13378));
        arrayInteger.add(arrayInteger1);
        System.out.println("из main "+Arrays.toString(arrayInteger.digits));
    }
}
