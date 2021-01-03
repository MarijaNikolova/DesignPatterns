package com.finki.designpatterns.creational.builder;

import com.finki.designpatterns.creational.builder.builders.CapriciozaPizzaBuilder;
import com.finki.designpatterns.creational.builder.builders.HawaiianPizzaBuilder;

public class Main {

  public static void main(String[] args) {
    PizzaDirector pizzaDirector1 = new PizzaDirector(new HawaiianPizzaBuilder());
    pizzaDirector1.constructPizza();
    Pizza pizza1 = pizzaDirector1.getPizza();
    System.out.println(pizza1);

    PizzaDirector pizzaDirector2 = new PizzaDirector(new CapriciozaPizzaBuilder());
    pizzaDirector2.constructPizza();
    Pizza pizza2 = pizzaDirector2.getPizza();
    System.out.println(pizza2);
  }
}
