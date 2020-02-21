package lesson_7;

public class Goat implements Eating, Speaking{
    // Возвращает тип пищи собаки
    @Override
    public String eat(){
        return "Сено";
    }
    // Возвращает тип пищи собаки
    @Override
    public String say(){
        return "Мее";
    }

    public static void main(String[] args) {
        Goat goat=new Goat();
        System.out.println(goat.eat());
    }
}
