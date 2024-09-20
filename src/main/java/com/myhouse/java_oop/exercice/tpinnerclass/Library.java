package com.myhouse.java_oop.exercice.tpinnerclass;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<Book>();

    //Start Inner class
    class Book {
        String title;
        String author;
        boolean isAvailable;

        public Book(String title, String author, boolean isAvailable){
            this.title = title;
            this.author = author;
            this.isAvailable = isAvailable;

        }
        public Book(){

        }

        public void borrowBook(){
            if(isAvailable){
                System.out.println("You've borrowed \""+title+"\"");
                isAvailable = false;
            }
            else
                System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
        }

        public void returnBook(){
            if(!isAvailable){
                System.out.println("You've returned \""+title+"\"");
                isAvailable = true;
            }

        }

        public String toString(){
            if(this.isAvailable)
                return "\""+this.title+"\""+" by "+ this.author+"(Available)";
            else
                return "\""+this.title+"\""+" by "+ this.author+"(Borrowed)";
        }
    }
    //End innerclass

    public  void addNewBook(String title, String author) {
        Book book = new Book(title, author, true);
        books.add(book);
        System.out.println("Added: \""+book.title+"\" by "+book.author+" (Available)");
    }

    public void borrowBook(String title){

        for(Book book: books)
            if(title.equalsIgnoreCase(book.title))
                book.borrowBook();

        displayBook();
    }

    public void returnBook(String title){

        for(Book book: books){
            if(title.equalsIgnoreCase(book.title)){
                book.returnBook();
            }
        }
        displayBook();
    }

//    public void (){
//        for(Book book: books){
//            if(book.returnBook(book)){
//                System.out.println("You've returned \""+book.title+"\"");
//            }
//        }
//        displayBook();
//
//    }

    public void displayBook(){
        System.out.println("Library collection: ");
        for( Book book: books ){
            System.out.println(book);
        }
    }



    public static void main(String[] args){

        System.out.println("********* After adding books *********");
        Library library = new Library();
        library.addNewBook("1984","George Orwell");
        library.addNewBook("To Kill a Mockingbird", "Harper Lee");

        System.out.println("********* After displaying books *********");
        library.displayBook();

        System.out.println("********* After borrowing a book *********");
        library.borrowBook("1984");

        System.out.println("********* After returning a book *********");
        library.returnBook("1984");

    }



}
