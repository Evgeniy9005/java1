package lesson_7;

public class Dog implements Eating, Speaking {

        // Возвращает тип пищи собаки
        @Override
        public String eat(){
            return "Мясо";
        }
         // Возвращает тип пищи собаки
        @Override
        public String say(){
        return "Гав";
        }
}
