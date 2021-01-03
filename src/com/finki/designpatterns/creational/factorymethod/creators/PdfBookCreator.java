package com.finki.designpatterns.creational.factorymethod.creators;

import com.finki.designpatterns.creational.factorymethod.books.Book;
import com.finki.designpatterns.creational.factorymethod.books.PdfBook;

public class PdfBookCreator extends AbstractCreator {

  public Book getInstance() {
    return new PdfBook();
  }
}
