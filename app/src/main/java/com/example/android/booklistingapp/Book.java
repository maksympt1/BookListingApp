package com.example.android.booklistingapp;

//An object that contains information about a single book.
public class Book {

    private String mTitle;
    private String mAuthors;

    //Public constructor
    public Book(String title, String authors){
        mTitle = title;
        mAuthors = authors;
    }

    //Methods
    public String getTitle () {return mTitle;}
    public String getAuthors () {return mAuthors;}

}
