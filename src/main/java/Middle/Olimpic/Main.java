package Middle.Olimpic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static Middle.Olimpic.NameOfCountry.*;

public class Main {
    public static void main(String[] args) {

//        Олимпиада.
//                Вам нужно написать последовательный выход стран на открытии Олимпийских игр по алфавиту. Нужно учесть, что Греция всегда выходит первой.
//        На вход: неотсортированный список стран (Япония, Канада, Россия и т.д.)
//        На выходе: Греция, Австралия, Австрия ….. Япония
//        Подсказка: используйте для этого Comparable

        List<Country> countries = new ArrayList<>();

        countries.add(new Country(GREASE));
        countries.add(new Country(ALBANIA));
        countries.add(new Country(ESTONIA));
        countries.add(new Country(RUSSIA));
        countries.add(new Country(UZBEKISTAN));
        countries.add(new Country(GUYANA));
        countries.add(new Country(DOMINICA));
        countries.add(new Country(NORWAY));
        countries.add(new Country(LEBANON));


        Collections.sort(countries);

        for (Country country: countries){
            System.out.println(country.getName());
        }
    }
}
