package enumclass;

public enum Seasons {
    WINTER("Winter"),
    AUTUMN("Autumn"),
    SPRING("Spring"),
    SUMMER("Summer");

    private String names;
    Seasons(String names) {
        this.names = names;
    }
    public String getNames() {
        return names;
    }
}
