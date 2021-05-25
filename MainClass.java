package lessons_2_4;

import java.util.*;

/**
 * 1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово.
 * 2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи,
 * а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
 * может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
 * выводиться все телефоны. Желательно не добавлять лишний функционал
 * (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
 * Консоль использовать только для вывода результатов проверки телефонного справочника.
 */

public class MainClass {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Mercedes", "BMW", "Audi", "Toyota", "Vokswagen",
                "Opel", "Subaru", "Range Rover", "Toyota", "Vokswagen",
                "BMW", "Audi", "Toyota", "Subaru", "Subaru",
                "Audi", "Toyota", "Subaru", "Subaru", "Toyota"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}

