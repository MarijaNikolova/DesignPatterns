package com.finki.designpatterns.creational.abstractfactory.factories;

import com.finki.designpatterns.creational.abstractfactory.products.AbstractProduct1;
import com.finki.designpatterns.creational.abstractfactory.products.AbstractProduct2;

public class Factory {

  private final ConcreteFactory concreteFactory;

  public Factory(ConcreteFactory concreteFactory) {
    this.concreteFactory = concreteFactory;
  }

  public AbstractProduct1 createProduct1() {
    return concreteFactory.createProduct1();
  }

  public AbstractProduct2 createProduct2() {
    return concreteFactory.createProduct2();
  }
}
