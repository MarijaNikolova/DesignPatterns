package com.finki.designpatterns.creational.factorymethod.creators;

import com.finki.designpatterns.creational.factorymethod.books.Book;
import com.finki.designpatterns.creational.factorymethod.books.EBook;

public class EBookCreator extends AbstractCreator {
  
  public Book getInstance() {
    return new EBook();
  }
}
