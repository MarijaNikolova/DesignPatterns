package com.finki.designpatterns.creational.factorymethod.creators;

import com.finki.designpatterns.creational.factorymethod.books.Book;
import com.finki.designpatterns.creational.factorymethod.books.EBook;
import com.finki.designpatterns.creational.factorymethod.books.PdfBook;

public abstract class AbstractCreator {
  
  public abstract Book getInstance();
}
