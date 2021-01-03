package com.finki.designpatterns.creational.factorymethod;

import com.finki.designpatterns.creational.factorymethod.books.Book;
import com.finki.designpatterns.creational.factorymethod.creators.AbstractCreator;
import com.finki.designpatterns.creational.factorymethod.creators.Creator;
import com.finki.designpatterns.creational.factorymethod.creators.EBookCreator;
import com.finki.designpatterns.creational.factorymethod.creators.PdfBookCreator;

public class Main {

    public static void main(String[] args) {

      // First implementation with different implementations for creator
      AbstractCreator creator1 = new EBookCreator();
      Book book1 = creator1.getInstance();
      book1.printType();

      AbstractCreator creator2 = new PdfBookCreator();
      Book book2 = creator2.getInstance();
      book2.printType();

      // Second implementation with one method
      Creator creator = new Creator();
      Book pdfBook = creator.getInstance("PdfBook");
      Book eBook = creator.getInstance("EBook");
      pdfBook.printType();
      eBook.printType();
    }
}
