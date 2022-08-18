package co.com.sofka.utils;

public enum Actors{

    OPEN_LANDING_PAGE_ACTOR("Bryan");
    private final String value;
    Actors(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

}
