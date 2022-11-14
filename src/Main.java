import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        byte age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, Вам необходимо еще подождать!");
        }
        //Задача №2
        System.out.println("Задача №2");
        short ageMan = 5;
        if (ageMan < 7){
            System.out.println("Вам необходимо еще повзрослеть");
        }
        if (ageMan >= 7)
        if (ageMan < 18) {
            System.out.println("Вам пора идти в школу");
        }
        if (ageMan >= 18)
        if (ageMan < 24) {
            System.out.println("Вам пора идти в университет");
        }
        if (ageMan >= 24) {
            System.out.println("Вам пора идти на работу");
        }
        //Задача №3
        System.out.println("Задача №3");
        short passengerNumber = 25;
        if (passengerNumber <= 60) {
            System.out.println("Отлично! Вам повезло, в вагоне есть еще сидячие места.");
        }
        if (passengerNumber > 60)
        if (passengerNumber <= 102) {
            System.out.println("Вы еще можете проехать в вагоне стоя, к сожалению, стоячих мест нет.");
        }
        if (passengerNumber > 102) {
            System.out.println("Мест нет! Вам необходимо пройти в следующий вагон.");
        }
        //Задача №4
        System.out.println("Задача №4");
        byte ageFriend = 5;
        if (ageFriend >= 18) {
            System.out.println("Поздравляем тебя с совершеннолетием!");
        } else {
            System.out.println("Тебе нужно еще немного подождать");
        }
        //Задача №5
        System.out.println("Задача №5");
        short ageKids = 24;
        if (ageKids < 7){
            System.out.println("Вам необходимо еще повзрослеть");
        }
        if (ageKids >= 7)
            if (ageKids < 18) {
                System.out.println("Вам пора идти в школу");
            }
        if (ageKids >= 18)
            if (ageKids < 24) {
                System.out.println("Вам пора идти в университет");
            } else {
            System.out.println("Вам пора идти на работу");
        }
        //Задача №6
        System.out.println("Задача №6");
        short passNumber = 120;
        if (passNumber <= 60) {
            System.out.println("Отлично! Вам повезло, в вагоне есть еще сидячие места.");
        }
        if (passNumber > 60)
            if (passNumber <= 102) {
                System.out.println("Вы еще можете проехать в вагоне стоя, к сожалению, стоячих мест нет.");
            } else {
            System.out.println("Мест нет! Вам необходимо пройти в следующий вагон.");
        }

    }
}