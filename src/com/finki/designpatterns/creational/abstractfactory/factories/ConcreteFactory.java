package com.finki.designpatterns.creational.abstractfactory.factories;

import com.finki.designpatterns.creational.abstractfactory.products.AbstractProduct1;
import com.finki.designpatterns.creational.abstractfactory.products.AbstractProduct2;

public interface ConcreteFactory {

  AbstractProduct1 createProduct1();

  AbstractProduct2 createProduct2();
}
