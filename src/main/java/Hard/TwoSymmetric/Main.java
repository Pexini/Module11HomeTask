package Hard.TwoSymmetric;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        Симметричная разность двух строк.
//        Симметрическая разность - Википедия
//        Например:
//        На вход подаётся два множества {1, 5, 7} и {1, 6, 8} на выходе разность равна {5, 7}


        Set<Integer> set1 = new HashSet<>(Set.of(1, 5, 7));
        Set<Integer> set2 = new HashSet<>(Set.of(1, 6, 8));

        // Создаем копии множеств, чтобы не изменять исходные
        Set<Integer> difference1 = new HashSet<>(set1);
        Set<Integer> difference2 = new HashSet<>(set2);

        // Удаляем из копий пересекающиеся элементы
        difference1.removeAll(set2);
        difference2.removeAll(set1);

        Set<Integer> symmetric = new HashSet<>(difference1);
        symmetric.addAll(difference2);

        System.out.println(symmetric);

    }

}
