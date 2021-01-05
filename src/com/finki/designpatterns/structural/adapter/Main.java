package com.finki.designpatterns.structural.adapter;

import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {

    Target adapter = new Adapter(new Adaptee());

    BigDecimal x = adapter.getX(new BigDecimal("100"));
    System.out.println(x);
  }
}
