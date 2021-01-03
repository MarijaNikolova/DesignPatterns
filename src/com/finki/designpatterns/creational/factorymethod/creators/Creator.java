package com.finki.designpatterns.creational.factorymethod.creators;

import com.finki.designpatterns.creational.factorymethod.books.Book;
import com.finki.designpatterns.creational.factorymethod.books.EBook;
import com.finki.designpatterns.creational.factorymethod.books.PdfBook;

public class Creator {

  public Book getInstance(String type) {

    if ("EBook".equals(type)) {
      return new EBook();
    } else if ("PdfBook".equals(type)) {
      return new PdfBook();
    }

    throw new IllegalArgumentException("Not supported book type");
  }

}
