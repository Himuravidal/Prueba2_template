package com.desafiolatam.prueba2_template.view.main;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;

import com.desafiolatam.prueba2_template.R;
import com.desafiolatam.prueba2_template.view.main.bookList.BookListFragment;

public class MainActivity extends AppCompatActivity {

    private Dialog dialog;
    private BookListFragment bookListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bookListFragment = (BookListFragment) getSupportFragmentManager().findFragmentById(R.id.bookListFragment);

        setDialog();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText bookInput = dialog.findViewById(R.id.bookInputET);
                bookInput.setText("");
                dialog.show();
            }
        });
    }


    private void setDialog() {
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_create_pending);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);

        final EditText bookInput = dialog.findViewById(R.id.bookInputET);
        ImageButton saveBtn = dialog.findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               //TODO validar el nombre  y guardar el libro
            }
        });



    }
}
