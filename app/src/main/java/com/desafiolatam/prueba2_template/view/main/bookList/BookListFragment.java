package com.desafiolatam.prueba2_template.view.main.bookList;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.desafiolatam.prueba2_template.R;
import com.desafiolatam.prueba2_template.adapters.BooksAdapter;
import com.desafiolatam.prueba2_template.models.Book;


public class BookListFragment extends Fragment implements BookListListener {

    public static final String BOOK_ID = "com.desafiolatam.prueba2_template.view.main.bookList.BOOK_ID";

    private BooksAdapter adapter;

    public BookListFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_books_list, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = (RecyclerView) view;
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        //TODO completar el recyclerView

    }

    public void addBook(Book book) {
        adapter.add(book);
    }


    @Override
    public void click(long id) {

        //TODO Pasar a la otra activity
      //  Intent intent = new Intent(getActivity(), DetailBooksActivity.class);
       // intent.putExtra(BOOK_ID, id);
       // startActivity(intent);

    }

}
