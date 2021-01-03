package com.finki.designpatterns.creational.builder.builders;

public class CapriciozaPizzaBuilder extends AbstractPizzaBuilder {

  @Override
  public void createTopping() {
    pizza.setTopping("capri topping");
  }

  @Override
  public void createDough() {
    pizza.setDough("capri dough");
  }

  @Override
  public void createSauce() {
    pizza.setSauce("ketchup");
  }
}
