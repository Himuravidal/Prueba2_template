package com.desafiolatam.prueba2_template.view.details;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.desafiolatam.prueba2_template.R;
import com.desafiolatam.prueba2_template.models.Book;

public class DetailBooksActivity extends AppCompatActivity {


    private Book book;
    private EditText descriptionBook;
    private TextView authorTV;
    private SeekBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

       //TODO :debes recibir los datos del intent mostrar los textos, y guardar la data cuando el usuario cambie de pantalla.

    }




}
