package com.finki.designpatterns.creational.builder.builders;

import com.finki.designpatterns.creational.builder.Pizza;

public abstract class AbstractPizzaBuilder {

  protected Pizza pizza;

  public Pizza getPizza() {
    return pizza;
  }

  public void createPizza() {
    pizza = new Pizza();
  }

  public abstract void createTopping();
  public abstract void createDough();
  public abstract void createSauce();
}
