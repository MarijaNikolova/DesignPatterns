package com.finki.designpatterns.structural.composite;

public class Leaf extends Component {

  public Leaf(String name) {
    super(name);
  }

  @Override
  public void addComponent(Component component) {
    System.out.println("Not possible in Leaf");
  }

  @Override
  public void removeComponent(Component component) {
    System.out.println("Not possible in Leaf");
  }

  @Override
  public void display(int n) {
    System.out.println("leaf component");
    System.out.println(name);
  }
}
