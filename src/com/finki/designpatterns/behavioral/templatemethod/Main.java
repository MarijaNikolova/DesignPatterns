package com.finki.designpatterns.behavioral.templatemethod;

public class Main {

  public static void main(String[] args) {
    FrameworkClass app1 = new ApplicationOne();
    FrameworkClass app2 = new ApplicationTwo();
    app1.templateMethod();
    app2.templateMethod();
  }
}
