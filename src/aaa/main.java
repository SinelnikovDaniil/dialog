package aaa;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Привет, как тебя зовут?");
        String name = input.nextLine();
        System.out.println("Приятно познакомиться, " + name);
        System.out.println(name + ", сколько тебе лет?");
        int age = input.nextInt();
        input.nextLine();
        System.out.println(age + ", какой ты взрослый!");
        System.out.println(name + ", какое твое хобби?");
        String hobby = input.nextLine();
        System.out.println("Я тоже люблю, " + hobby);
        System.out.println(name + ", какой твой любимый цвет?");
        String color = input.nextLine();
        System.out.println("Мне тоже нравится " + color);
        System.out.println(name + ", какой у тебя рост?");
        int height = input.nextInt();
        System.out.println(height + ", ты такой высокий!");
        System.out.println(name + ", какой у тебя вес?");
        int weight = input.nextInt();
        System.out.println(weight + ", ты такой тяжелый!");
        System.out.println(name + ", из какого ты города?");
        input.nextLine();
        String city = input.nextLine();
        System.out.println(city + ", я тоже от туда.");
        System.out.println(name + ", в какой стране ты бы хотел побывать?");
        String country = input.nextLine();
        System.out.println(country + ", я бы тоже туда хотел.");
        System.out.println(name + ", какой вид спорта тебе нравится?");
        String sport = input.nextLine();
        System.out.println("Мне тоже нравится " + sport);
        System.out.println(name + ", какая твоя любимая игра?");
        String game = input.nextLine();
        System.out.println("Я тоже играю в " + game);
        System.out.println(name + ", тебе больше нравятся кошки или собаки?");
        String animal = input.nextLine();
        System.out.println("Мне тоже нравятся " + animal);
        System.out.println(name + ", какое твое любимое время года?");
        String season1 = input.nextLine();
        System.out.println("Мне тоже нравится " + season1);
        System.out.println(name + ", а какое время года ты не любишь?");
        String season2 = input.nextLine();
        System.out.println(season2 + ", я тоже её не люблю.");
        System.out.println(name + ", какой твой любимый фильм?");
        String film = input.nextLine();
        System.out.println(film + ", хороший фильм.");
        System.out.println(name + ", какую музыку ты слушаешь?");
        String music = input.nextLine();
        System.out.println("Я тоже слушаю " + music);
        System.out.println(name + ", чего ты больше всего боишься?");
        String phobia = input.nextLine();
        System.out.println("Я тоже боюсь " + phobia);
        System.out.println(name + ", сколько часов в сутки ты проводишь за компьютером?");
        int hours = input.nextInt();
        System.out.println(hours + ", это очень много!");
        System.out.println(name + ", какая у тебя модель телефона?");
        input.nextLine();
        String phone = input.nextLine();
        System.out.println(phone + ", хороший телефон.");
        System.out.println(name + ", какой твой любимый музыкант или музыкальная группа?");
        String music2 = input.nextLine();
        System.out.println("Я тоже слушаю " + music2);
        System.out.println(name + ", какая твоя любимая еда?");
        String food = input.nextLine();
        System.out.println("Я тоже люблю " + food);

    }
}
