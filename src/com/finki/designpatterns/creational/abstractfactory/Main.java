package com.finki.designpatterns.creational.abstractfactory;

import com.finki.designpatterns.creational.abstractfactory.factories.ConcreteFactory1;
import com.finki.designpatterns.creational.abstractfactory.factories.ConcreteFactory2;
import com.finki.designpatterns.creational.abstractfactory.factories.Factory;

public class Main {

  public static void main(String[] args) {

    Factory factory1 = new Factory(new ConcreteFactory1());

    factory1.createProduct1();
    factory1.createProduct2();

    Factory factory2 = new Factory(new ConcreteFactory2());

    factory2.createProduct1();
    factory2.createProduct2();
  }
}
