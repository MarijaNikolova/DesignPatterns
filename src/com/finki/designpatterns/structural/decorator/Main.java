package com.finki.designpatterns.structural.decorator;

public class Main {

  public static void main(String[] args) {

    SportsCarDecorator sportsCarDecorator = new SportsCarDecorator(new LuxuryCarDecorator(new LuxuryCarDecorator(new BasicCar())));

    sportsCarDecorator.assemble();
  }
}
