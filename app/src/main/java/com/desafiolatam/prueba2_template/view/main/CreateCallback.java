package com.desafiolatam.prueba2_template.view.main;

import com.desafiolatam.prueba2_template.models.Book;

/**
 * Created by adacher on 31-10-17.
 */

public interface CreateCallback {

    void success(Book book);

    void fail();


}
