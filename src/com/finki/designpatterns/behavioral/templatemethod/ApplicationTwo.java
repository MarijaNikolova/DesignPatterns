package com.finki.designpatterns.behavioral.templatemethod;

public class ApplicationTwo extends FrameworkClass {

  @Override
  protected void stepOne() {
    System.out.println("application two step one");
  }

  @Override
  protected void stepTwo() {
    System.out.println("application two step two");
  }
}
