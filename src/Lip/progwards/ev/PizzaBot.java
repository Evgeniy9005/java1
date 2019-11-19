package Lip.progwards.ev;


import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.testlesson.ProgwardsTelegramBot;

public class PizzaBot extends ProgwardsTelegramBot {
    private final String menu = "У нас есть пицца";

    @Override // Переопределяет метод который есть у родителя
    public String processMessage(String text) {
        checkTags(text);
        if (foundCount() == 1) {
            if (checkLastFound("привет"))
                return "Приветствую тебя, о мой повелитель!\n Что желаешь? ";
            if (checkLastFound("конец"))
                return "Спасибо за заказ ";
            if (checkLastFound("дурак"))
                return "Не надоругаться. Я не волшебник, я только учусь";


            return "Отлично, добавляю в заказ " + getLastFound() + " Желаешь что-то еще?";
        }
        if (foundCount() > 1)
            return "Под твой запрос подходит: \n" + extract() + "Выбери что-то одно, и я добавлю это в заказ.";
        return "Я не понял, возможно у нас этого нет, попробуй сказать по другому. ";

    }

    //private void checkTags(String text) {
    //}

    public static void main(String[] args){
        System.out.println("Hello Bot!");
        ApiContextInitializer.init();

        PizzaBot bot = new PizzaBot();
        bot.username = "Pizza24on7bot";
        bot.token = "1064357181:AAG28foMywg5OOm2082BE48fOS9gS7AeJLc";

        bot.addTags("привет", "привет, здрасьте, здравствуй, добр, день, вечер, утро, hi, hello");
        bot.addTags("конец", "конец, все, стоп, нет");
        bot.addTags("дурак", "дурак, придурок, идиот, тупой");

        bot.addTags("Пицца гавайская", "гавайск, пицц, ананас, куриц");
        bot.addTags("Пицца маргарита", "маргарит, пицц, моцарелла, сыр, кетчуп, помидор");
        bot.addTags("Пицца пеперони", "пеперони, пицц, салями, колбас, сыр, кетчуп, помидор");

        bot.addTags("Торт тирамису", "десерт, кофе, маскарпоне, бисквит");
        bot.addTags("Торт медовик", "десерт, мед, бисквит");
        bot.addTags("Эклеры", "десерт, заварной, крем, тесто");

        bot.addTags("Кола", "напит, пить, кола");
        bot.addTags("Холодный чай", "напит, пить, чай, липтон, лимон");
        bot.addTags("Сок", "напит, пить, сок, апельсиноый, яблочный, вишневый");

        //bot.start();
        bot.start();
    }
}
