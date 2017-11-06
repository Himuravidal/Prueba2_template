package com.desafiolatam.prueba2_template.view.main;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.desafiolatam.prueba2_template.R;
import com.desafiolatam.prueba2_template.models.Book;
import com.desafiolatam.prueba2_template.view.main.bookList.BookListFragment;

public class MainActivity extends AppCompatActivity implements CreateCallback {

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
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.showSoftInput(getCurrentFocus(), InputMethodManager.SHOW_FORCED);

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

        bookInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_NEXT || i == EditorInfo.IME_ACTION_DONE) {

                    String bookName = bookInput.getText().toString();
                    createdBooks(bookName);

                    return true;
                }

                return false;
            }
        });


    }


    private void createdBooks(String name) {

        BookValidation bookValidation = new BookValidation(MainActivity.this);
        bookValidation.init(name);
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_IMPLICIT, 0);
        dialog.dismiss();


    }

    @Override
    public void success(Book book) {

        bookListFragment.addBook(book);

    }

    @Override
    public void fail() {

        Toast.makeText(this, "Ingresa un Libro", Toast.LENGTH_SHORT).show();
    }
}
