package com.finki.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class DiscountStrategy implements Strategy {

  private double percentage;

  public DiscountStrategy(double percentage) {
    this.percentage = percentage;
  }

  @Override
  public BigDecimal getTotalPrice(Context context) {

    BigDecimal sum = context
      .getIndividualPrices()
      .stream().map(price -> price.subtract(price.multiply(BigDecimal.valueOf(percentage))))
      .reduce(BigDecimal.ZERO, BigDecimal::add);

    return sum;
  }
}
