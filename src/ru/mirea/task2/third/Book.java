package ru.mirea.task2.third;

public class Book {
    private String author;
    private String name;
    private String year;

    public Book(String author, String name, String year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public Book(){
        this.author = "unknown";
        this.name = "unknown";
        this.year = "unknown";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

    public  void setYear(String year){ this.year = year; }

    public String getYear(){ return this.year; }

    public String toString() {
        return "Author: " +this.author + ", name: " + this.name + ", year: "+ this.year;
    }
}
