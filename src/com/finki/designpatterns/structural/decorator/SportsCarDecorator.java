package com.finki.designpatterns.structural.decorator;

public class SportsCarDecorator extends Decorator {

  public SportsCarDecorator(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Sports Car decorator");
  }
}
