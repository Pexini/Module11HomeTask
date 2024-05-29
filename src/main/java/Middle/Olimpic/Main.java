package Middle.Olimpic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Олимпиада.
//                Вам нужно написать последовательный выход стран на открытии Олимпийских игр по алфавиту. Нужно учесть, что Греция всегда выходит первой.
//        На вход: неотсортированный список стран (Япония, Канада, Россия и т.д.)
//        На выходе: Греция, Австралия, Австрия ….. Япония
//        Подсказка: используйте для этого Comparable

        List<Country> countries = new ArrayList<>();

        countries.add(new Country("Grease"));
        countries.add(new Country("Albania"));
        countries.add(new Country("Estonia"));
        countries.add(new Country("Russia"));
        countries.add(new Country("Uzbekistan"));
        countries.add(new Country("Guyana"));
        countries.add(new Country("Dominica"));
        countries.add(new Country("Norway"));
        countries.add(new Country("Lebanon"));

        Collections.sort(countries);

        for (Country country: countries){
            System.out.println(country.getName());
        }


    }
}
