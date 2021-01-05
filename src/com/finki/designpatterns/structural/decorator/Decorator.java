package com.finki.designpatterns.structural.decorator;

public abstract class Decorator implements Car {

  protected Car car;

  public Decorator(Car car) {
    this.car = car;
  }

  @Override
  public void assemble() {
    car.assemble();
  }
}
