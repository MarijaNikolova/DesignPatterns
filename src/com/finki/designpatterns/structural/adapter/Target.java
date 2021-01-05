package com.finki.designpatterns.structural.adapter;

import java.math.BigDecimal;

public class Target {

  public BigDecimal getX(BigDecimal y) {
    return y.multiply(new BigDecimal(14));
  }
}
