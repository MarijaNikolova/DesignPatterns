package com.finki.designpatterns.behavioral.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingStrategy implements Strategy {

  private int roundTo;

  public RoundingStrategy(int roundTo) {
    this.roundTo = roundTo;
  }

  @Override
  public BigDecimal getTotalPrice(Context context) {

    BigDecimal roundedAmount = context
      .getIndividualPrices()
      .stream()
      .map(price -> price.setScale(roundTo, RoundingMode.CEILING))
      .reduce(BigDecimal.ZERO, BigDecimal::add);

    return roundedAmount;
  }
}

