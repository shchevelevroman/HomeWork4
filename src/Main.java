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
        short ageKids = 23;
        if (ageKids < 7){
            System.out.println("Вам необходимо еще повзрослеть");}
        else if (ageKids >= 7 && ageKids < 18) {
                System.out.println("Вам пора идти в школу");}
        else if (ageKids >= 18 && ageKids < 24) {
                System.out.println("Вам пора идти в университет");
        } else {
            System.out.println("Вам пора идти на работу");}
        //Задача №6
        System.out.println("Задача №6");
        short passNumber = 5;
        if (passNumber <= 60) {
            System.out.println("Отлично! Вам повезло, в вагоне есть еще сидячие места.");}
        else if (passNumber > 60 && passNumber <= 102) {
                System.out.println("Вы еще можете проехать в вагоне стоя, к сожалению, стоячих мест нет.");
        } else {
            System.out.println("Мест нет! Вам необходимо пройти в следующий вагон.");}
        //Задача №7
        System.out.println("Задача №7");
        int peapleAge = 24;
        if (peapleAge < 2) {
            System.out.println("ты еще слишком мал");}
        else if (peapleAge >=2 && peapleAge <=6) {
            System.out.println("Если возраст человека равен " + peapleAge + ", то ему нужно ходить в детский сад");}
        else if (peapleAge >= 7 && peapleAge <= 18) {
            System.out.println("Если возраст человека равен " + peapleAge + ", то ему нужно ходить в школу");}
        else if (peapleAge > 18 && peapleAge < 24) {
            System.out.println("Если возраст человека равен " + peapleAge + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + peapleAge + ", то ему нужно ходить на работу");}

        //Задача №8
        System.out.println("Задача №8");
        short ageChildren = 14;
        if (ageChildren <= 5) {
            System.out.println("Если ребенку " + ageChildren + ", то ему еще нельзя кататься на данном аттракционе");}
        else if (ageChildren > 5 && ageChildren <= 14) {
            System.out.println("Если ребенку " + ageChildren + ", кататься на данном аттракционе можно только с сопровождением взрослого");
        } else {
            System.out.println("Если ребенку " + ageChildren + ", то ему можно кататься на данном аттракционе ,без присутствия взрослого");}

        //Задача №9  // else мне совсем не понятен!
        System.out.println("Задача №9");
        int one = 10;
        int two = 33;
        int three = 50;
        if ( one > two && one > three){
            System.out.println("Первое число самое большое");}
            else if (two > three && two > one) {
            System.out.println("Второе число самое большое");
        } else {
            System.out.println("Третье число самое большое");}





    }
}