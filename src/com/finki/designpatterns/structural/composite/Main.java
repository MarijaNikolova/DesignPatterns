package com.finki.designpatterns.structural.composite;

public class Main {

  public static void main(String[] args) {

    Component root = new Composite("root");
    root.addComponent(new Leaf("leaf1"));
    root.addComponent(new Leaf("leaf2"));

    Component secondComposite = new Composite("second level composite");
    root.addComponent(secondComposite);

    secondComposite.addComponent(new Leaf("4"));
    secondComposite.addComponent(new Leaf("6"));

    root.display(2);
  }
}
