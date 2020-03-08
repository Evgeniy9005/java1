package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    public static CacheInfo lastFibo; // Статическая переменная
    //____________________________________________________
    // Вложенный класс
    public static class CacheInfo{
        public int n; //- число, для которого рассчитываем Фибоначчи
        public int fibo; //- результат расчета
    }
    //____________________________________________________
    // Возвращает n-ое число Фибоначчи (нумерация начинается с 1, то есть при n = 3
    // должно вернуться число Фибоначчи 2, а при n = 10 число 55).
    public static int fiboNumber(int n) {
        CacheInfo cacheInfo=new CacheInfo();
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
        cacheInfo.fibo=fibo;
        cacheInfo.n=n;
        lastFibo=cacheInfo;
        return fibo;

    }
   //____________________________________________________
    //возвращает lastFibo
    public CacheInfo getLastFibo(){
        return lastFibo;
    }
    //____________________________________________________
    //сбрасывает lastFibo в null
    public void clearLastFibo(){
        lastFibo=null;
    }
    //____________________________________________________
    public static void main(String[] args) {
    CalculateFibonacci cF =new CalculateFibonacci();
    CacheInfo cacheInfo =new CacheInfo();
    System.out.println(fiboNumber(5));
    System.out.println("n="+cF.getLastFibo().n+" fibo="+cF.getLastFibo().fibo);
    cF.clearLastFibo();//Сброс LastFibo в null
    System.out.println("Сброшенная в null n= "+cF.getLastFibo().n+" fibo="+cF.getLastFibo().fibo);
    }

}
