package org.iis2024;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Represents a calendar date with validation capabilities.
 */
public class Date {
    private int fieldAddedByCollaborator;
    private final int day;
    private final int month;
    private final int year;

    // Exercise 6: nueva variable de estado
    private String label;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    /**
     * Constructs a Date object representing a specific day, month, and year.
     * Exercise 7: Resolvido volviendo a los parámetros originales.
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Validates the date according to the predefined rules.
     */
    public boolean validate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        String dateString = String.format("%d/%d/%d", day, month, year);

        try {
            dateFormat.parse(dateString);
            return (year >= 1900) && (year <= 2050);
        } catch (ParseException e) {
            return false;
        }
    }

    // Exercise 6: nuevo método
    public void printDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    // Getter y setter para label
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    // Exercise 7: método añadido por el owner
    public void methodAddedByOwner() {
        System.out.println("Method added by the owner");
    }
}