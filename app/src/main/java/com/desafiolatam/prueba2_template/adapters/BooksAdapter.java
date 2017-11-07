package com.desafiolatam.prueba2_template.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.desafiolatam.prueba2_template.models.Book;
import com.desafiolatam.prueba2_template.view.main.bookList.BookListListener;

/**
 * Created by adacher on 31-10-17.
 */

public class BooksAdapter {


    // private List<Book> books = new BooksData().ListAll();

    private BookListListener listener;

    public BooksAdapter(BookListListener listener) {
        this.listener = listener;
    }


    //TODO tienes que encontrar el recurso de la vista de lista en el recyclerView


    public void add(Book book) {


        //TODO Este metodo debe añadir un libro a la base de Datos.

    }


    public class Viewholder extends RecyclerView.ViewHolder {


        public Viewholder(View itemView) {
            super(itemView);

            //TODO debes encontrar las vistas de los elementos de los Recursos que se muestran en el RecyclerView

        }
    }


}
