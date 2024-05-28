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
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        sortedMap.forEach((word, count) -> System.out.println(word + "[" + count + "]"));

    }


}
