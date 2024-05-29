package Middle.Olimpic;

public class Country implements Comparable<Country> {
    public Country(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Country o) {
        if (this.name.equals("Grease")) {
            return -1;
        }
        if (o.name.equals("Grease")) {
            return 1;
        }
        return this.name.compareTo(o.name);
    }
}
