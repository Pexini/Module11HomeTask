package Middle.FirstVolumeWorlds;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        String text = "Идут три брата: брат Клим брит, брат Глеб брит, брат Игнат бородат." ;

        text = text.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").toLowerCase();
        String[] words = text.split("\\s+");

        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
//        for (String word : words) {
//            if (wordMap.containsKey(word)){
//
//                System.out.println(word + "[" + wordMap.get(word) + "]");
//                wordMap.remove(word);
//            }
//        }

        Map<String, Integer> sortedMap = wordMap.entrySet()
                .stream() // Преобразует Set в стрим, позволяя выполнять последовательные операции над элементами набора.
                .sorted( //sorted - Операция сортировки;
                        Map.Entry.<String, Integer>comparingByValue // Map.Entry.comparingByValue(): Метод, который возвращает компаратор для сравнения записей Map по их значениям.
                        (Comparator.reverseOrder())) // Comparator.reverseOrder(): Метод, который возвращает компаратор, осуществляющий обратный порядок сортировки.
                .collect( //Операция терминала стрима, которая преобразует стрим в другую форму.
                        Collectors.toMap( //Сборщик, который собирает элементы стрима в Map.
                        Map.Entry::getKey, //Функция для извлечения ключа из записи Map.
                        Map.Entry::getValue, // Функция для извлечения значения из записи Map.
                        (e1, e2) -> e1, // Функция разрешения коллизий. Если встречаются два одинаковых ключа- выбирается первый из них.
                        LinkedHashMap::new //Поставщик новой карты, в которой будет сохранен порядок добавления элементов
                ));
        sortedMap.forEach((word, count) -> System.out.println(word + "[" + count + "]"));

    }


}
