package com.finki.designpatterns.structural.adapter;

import java.math.BigDecimal;

public class Adapter extends Target {

  private Adaptee adaptee;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public BigDecimal getX(BigDecimal y) {

    int yInt = y.intValue();
    int xInt = adaptee.calculateX(yInt);
    return new BigDecimal(xInt);
  }
}
