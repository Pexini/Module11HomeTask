package Middle.Olimpic;

public enum NameOfCountry {
    GREASE ("Grease"),
    ALBANIA ("Albania"),
    ESTONIA ("Estonia"),
    RUSSIA ("Russia"),
    UZBEKISTAN ("Uzbekistan"),
    GUYANA ("Guyana"),
    DOMINICA ("Dominica"),
    NORWAY ("Norway"),
    LEBANON ("Lebanon");

private final String name;

    NameOfCountry(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
