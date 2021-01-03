package com.finki.designpatterns.creational.abstractfactory.factories;

import com.finki.designpatterns.creational.abstractfactory.products.AbstractProduct1;
import com.finki.designpatterns.creational.abstractfactory.products.AbstractProduct2;
import com.finki.designpatterns.creational.abstractfactory.products.Product1A;
import com.finki.designpatterns.creational.abstractfactory.products.Product2A;

public class ConcreteFactory1 implements ConcreteFactory {

  public AbstractProduct1 createProduct1() {
    System.out.println("Product 1A");
    return new Product1A();
  }

  public AbstractProduct2 createProduct2() {
    System.out.println("Product 2A");
    return new Product2A();
  }
}
