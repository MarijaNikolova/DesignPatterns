package com.finki.designpatterns.behavioral.templatemethod;

public abstract class FrameworkClass {

  public void templateMethod() {
    System.out.println("Template method");
    stepOne();
    stepTwo();
    System.out.println("End of template method");
  }

  protected abstract void stepOne();
  protected abstract void stepTwo();

}
