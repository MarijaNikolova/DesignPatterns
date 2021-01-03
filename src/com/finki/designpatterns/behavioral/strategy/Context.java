package com.finki.designpatterns.behavioral.strategy;

import java.math.BigDecimal;
import java.util.List;

public class Context {

  private Strategy strategy;
  private List<BigDecimal> individualPrices;

  public Context(Strategy strategy, List<BigDecimal> individualPrices) {
    this.strategy = strategy;
    this.individualPrices = individualPrices;
  }

  public List<BigDecimal> getIndividualPrices() {
    return individualPrices;
  }

  public void getPrice() {
    System.out.println(strategy.getTotalPrice(this));
  }
}
