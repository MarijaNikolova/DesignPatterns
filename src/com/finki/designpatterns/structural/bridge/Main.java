package com.finki.designpatterns.structural.bridge;

public class Main {

  public static void main(String[] args) {
    Shape shape1 = new Rectangle(new Blue());
    shape1.draw();

    Shape shape2 = new Circle(new Red());
    shape2.draw();
  }
}
