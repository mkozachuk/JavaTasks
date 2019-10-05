/*package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain].
Параметр конструктора - название книги (title).
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook измените тип возвращаемого значения на более подходящий.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.


*/
/*
public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            //Add your code here
            if (getBook() instanceof AgathaChristieBook )
                return agathaChristieOutput;
            else
                return markTwainOutput;


           // return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book{

        public MarkTwainBook(String title) {
            super(title);
            title = this.getTitle();
        }

        @Override
        public Book getBook() {
            return MarkTwainBook;
        }

        @Override
        public String getTitle() {
            return null;
        }
    }

    public static class AgathaChristieBook extends Book{
        public AgathaChristieBook(String title) {
            super(title);
            title = this.getTitle();
        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public Book getBook() {
            return this;
        }
    }


}
*/