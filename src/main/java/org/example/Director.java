package org.example;


public class Director {

    private String directorName;
    private String directorSurname;

    public Director(String directorName, String directorSurname) {
        this.directorName = directorName;
        this.directorSurname = directorSurname;

    }

    static Director director1 = new Director("Guy", "Ritchie");
    static Director director2 = new Director("Olaf", "Lubaszenko");
    static Director director3 = new Director("Roman", "Polanski");
    static Director director4 = new Director("Krzysztof", "Kieslowski");

    @Override
    public String toString() {
        return this.directorName + " " + this.directorSurname;
    }
}
