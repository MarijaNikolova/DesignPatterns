package com.finki.designpatterns.behavioral.strategy;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    Strategy roundingStrategy = new RoundingStrategy(0);
    Strategy discountStrategy = new DiscountStrategy(0.3);

    BigDecimal one = new BigDecimal("1000");
    BigDecimal two = new BigDecimal("1000.3232323");
    BigDecimal three = new BigDecimal("1000.56666");

    Context context1 = new Context(roundingStrategy, Arrays.asList(one, two, three));
    Context context2 = new Context(discountStrategy, Arrays.asList(one, two, three));

    context1.getPrice();
    context2.getPrice();
  }
}
