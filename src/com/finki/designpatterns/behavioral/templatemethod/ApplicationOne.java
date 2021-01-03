package com.finki.designpatterns.behavioral.templatemethod;

public class ApplicationOne extends FrameworkClass {

  @Override
  protected void stepOne() {
    System.out.println("Application one step one");
  }

  @Override
  protected void stepTwo() {
    System.out.println("Application one step two");
  }
}
