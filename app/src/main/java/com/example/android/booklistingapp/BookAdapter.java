package com.example.android.booklistingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends ArrayAdapter {

    //Public constructor
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    //Returns a list item view about the book at the given position in the list of books
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if there is an existing list
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        // Find the book at the given position in the list of books
        Book currentBook = (Book) getItem(position);

        // Hook everything up
        //Title
        TextView titleView = listItemView.findViewById(R.id.book_title);
        titleView.setText(currentBook.getTitle());
        //Authors
        TextView authorsView = listItemView.findViewById(R.id.book_authors);
        authorsView.setText(currentBook.getAuthors());

        //Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
