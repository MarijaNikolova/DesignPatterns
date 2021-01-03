package com.finki.designpatterns.creational.builder.builders;

public class HawaiianPizzaBuilder extends AbstractPizzaBuilder {

  @Override
  public void createTopping() {
    pizza.setTopping("hawaiian cheese");
  }

  @Override
  public void createDough() {
    pizza.setDough("hawaiian dough");
  }

  @Override
  public void createSauce() {
    pizza.setSauce("ketchup pineapple");
  }
}
