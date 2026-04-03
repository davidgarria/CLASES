package model;

import java.io.Serializable;
import java.util.List;

public class Libro implements Serializable {

    private int id;
    private String Title;
    private int Year;
    private int Pages;
    private List<String> Notes;

    public Libro() {}

    // Getters
    public int getId()       { return id; }
    public String getTitle() { return Title; }
    public int getYear()     { return Year; }
    public int getPages()    { return Pages; }
    public List<String> getNotes()  { return Notes; }

    @Override
    public String toString() {
        return "📖 [" + id + "] " + Title +
                " (" + Year + ") | " + Pages + " páginas" +
                "\n    Notas: " + Notes;
    }
}