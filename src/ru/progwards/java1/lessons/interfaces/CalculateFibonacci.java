package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {

    public static CacheInfo lastFibo; // Статическая переменная
    //____________________________________________________
    // Вложенный класс
    public static class CacheInfo{
        public int n=0; //- число, для которого рассчитываем Фибоначчи
        public int fibo=0; //- результат расчета
    }
    //____________________________________________________
    // Возвращает n-ое число Фибоначчи (нумерация начинается с 1, то есть при n = 3
    // должно вернуться число Фибоначчи 2, а при n = 10 число 55).

    public static int fiboNumber(int n) {
       CacheInfo cacheInfo=new CacheInfo();
       CalculateFibonacci.lastFibo=cacheInfo;
        int i=0;
        int n1=0;
        int fibo=0;
        do {
            fibo=fibo+n1;
            n1=fibo-n1;
            i++;
            if (fibo==0) fibo=1;
            System.out.println("Значение №"+i+" - "+fibo);
        }while (i!=n);
        System.out.println("___________________");
        if (n!=fibo) fiboNumber(fibo);
        CalculateFibonacci.lastFibo.fibo=fibo;
        CalculateFibonacci.lastFibo.n=n;
        return fibo;
    }

   //____________________________________________________
    //возвращает lastFibo
    public CacheInfo getLastFibo(){
        CacheInfo cacheInfo1;
        cacheInfo1=CalculateFibonacci.lastFibo;
        return cacheInfo1;
    }
    //____________________________________________________
    //сбрасывает lastFibo в null
    public void clearLastFibo(){
        CacheInfo cacheInfo1;
        cacheInfo1=null;
        CalculateFibonacci.lastFibo=cacheInfo1;
    }

    //____________________________________________________
    public static void main(String[] args) {
    CalculateFibonacci cF =new CalculateFibonacci();
    CacheInfo cacheInfo =new CacheInfo();
    System.out.println(CalculateFibonacci.fiboNumber(5));

    System.out.println("n="+cF.getLastFibo().n+" fibo="+cF.getLastFibo().fibo);
    cF.clearLastFibo();//Сброс LastFibo в null
    System.out.println("Сброшенная в null n= "+CalculateFibonacci.lastFibo.n+" fibo="+CalculateFibonacci.lastFibo.fibo);
    }

}
