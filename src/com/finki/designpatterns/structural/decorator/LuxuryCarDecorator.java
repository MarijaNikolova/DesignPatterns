package com.finki.designpatterns.structural.decorator;

public class LuxuryCarDecorator extends Decorator {

  public LuxuryCarDecorator(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Luxury car decorator.");
  }
}
