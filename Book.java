package ru.mirea.lab1;

public class Book {
    private String title;
    private String author;

    public Book(String t, String a){
        title = t;
        author = a;
    }
    public Book(String t) {
        title = t;
        author = "none";
    }
    public Book(){
        title = "none";
        author = "none";
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String toString(){
        return "Название: " + this.title + ", автор: " + this.author;
    }
}
