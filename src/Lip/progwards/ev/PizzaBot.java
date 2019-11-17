package Lip.progwards.ev;

import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.testlesson.ProgwardsTelegramBot;

public class PizzaBot extends ProgwardsTelegramBot{

    @Override // Переопределяет метод который есть у родителя
    public String processMessage(String text) {
        return text; //-прекращает выполнение метода и возвращает значение
    }

    public static void main(String[] args){
        System.out.println("Hello Bot!");
        ApiContextInitializer.init();

        PizzaBot bot = new PizzaBot();
        bot.username = "Pizza24on7bot";
        bot.token = "1064357181:AAG28foMywg5OOm2082BE48fOS9gS7AeJLc";
        bot.addTags("Пицца гавайская", "гавайск, пицц, ананас, куриц");
        bot.addTags("Пицца маргарита", "маргарит, пицц, моцарелла, сыр, кетчуп, помидор");
        bot.addTags("Пицца пеперони", "пеперони, пицц, салями, колбас, сыр, кетчуп, помидор");
        bot.start();
    }
}
