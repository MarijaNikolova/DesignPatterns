package com.finki.designpatterns.creational.builder;

import com.finki.designpatterns.creational.builder.builders.AbstractPizzaBuilder;

public class PizzaDirector {

  private AbstractPizzaBuilder builder;

  public PizzaDirector(AbstractPizzaBuilder builder) {
    this.builder = builder;
  }

  public Pizza getPizza() {
    return builder.getPizza();
  }

  public void constructPizza() {
    builder.createPizza();
    builder.createDough();
    builder.createSauce();
    builder.createTopping();
  }
}
