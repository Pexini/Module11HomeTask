package Middle.FirstVolumeWorlds;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Идут три брата: брат Клим брит, брат Глеб брит, брат Игнат бородат." ;

        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : lines) {
            word = word.replaceAll("[^A-Za-zА-Яа-я]", "").toLowerCase();
            String[] arr = word.split(" ");
            for (String i : arr) {
                if (wordMap.containsKey(i)){
                    wordMap.put(i, word.get(i) + 1);
                }
            }
                System.out.println(entry.getKey() + " [" + entry.getValue() + "]");
            }
        }
    }
