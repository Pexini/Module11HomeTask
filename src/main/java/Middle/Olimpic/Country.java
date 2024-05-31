package Middle.Olimpic;

public class Country implements Comparable<Country> {
    private NameOfCountry nameOfCountry;

    public Country(NameOfCountry nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public String  getName() {
        return nameOfCountry.getName();
    }

    @Override
    public int compareTo(Country o) {
        if (this.nameOfCountry == NameOfCountry.GREASE) {
            return -1;
        }
        if (o.nameOfCountry == NameOfCountry.GREASE) {
            return 1;
        }
        return this.nameOfCountry.getName().compareTo(o.nameOfCountry.getName());
    }
}
