package com.finki.designpatterns.creational.abstractfactory.factories;

import com.finki.designpatterns.creational.abstractfactory.products.AbstractProduct1;
import com.finki.designpatterns.creational.abstractfactory.products.AbstractProduct2;
import com.finki.designpatterns.creational.abstractfactory.products.Product1B;
import com.finki.designpatterns.creational.abstractfactory.products.Product2B;

public class ConcreteFactory2 implements ConcreteFactory {

  public AbstractProduct1 createProduct1() {
    System.out.println("Product 1B");
    return new Product1B();
  }

  public AbstractProduct2 createProduct2() {
    System.out.println("Product 2B");
    return new Product2B();
  }
}
