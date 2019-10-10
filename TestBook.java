package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Преступление и наказание", "Достоевский Ф.М.");
        Book b2 = new Book("Мастер и маргарита", "Булгаков М.A.");


        System.out.println(b1);
        System.out.println(b2);
    }
}
