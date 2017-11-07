package com.desafiolatam.prueba2_template.view.details;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.SeekBar;

import com.desafiolatam.prueba2_template.R;
import com.desafiolatam.prueba2_template.models.Book;

public class DetailBooksActivity extends AppCompatActivity {


    private Book book;
    private EditText review, author;
    private SeekBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //TODO get the intent from the previous activity, using that id find the book in the database
        //TODO get every view, look at the layout and the field variables
        //TODO set the attributes of the book to the views (author, review, progress), don't forget to validate the attribute in the book is not null
        //TODO don't forget to set the activity title as the book title

    }




    //TODO remember you have to save without the user noticing it, it has to be flawless, override the activity life cycle for that



}
