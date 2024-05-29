package Middle.UnicumNumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
// “Уникальные числа”
//       Вводится n целых чисел. Определите, сколько различных чисел было введено.
//        Например: 1 3 3 5 6 7 7 7
//        Ответ: 5
//        Используйте для решения задачи коллекции.

        List<Integer> list = new ArrayList<>(List.of(1, 3, 3, 5, 6, 7, 7, 7));
        Set<Integer> uniquenumbers = new HashSet<>(list);

        System.out.println("sum of unique numbers " + uniquenumbers.size());
        System.out.println("unique numbers " + uniquenumbers);

    }
}
