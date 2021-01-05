package com.finki.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

  private List<Component> components = new ArrayList<>();

  public Composite(String name) {
    super(name);
  }

  @Override
  public void addComponent(Component component) {
    components.add(component);
  }

  @Override
  public void removeComponent(Component component) {
    components.remove(component);
  }

  @Override
  public void display(int n) {

    System.out.println("Name");
    System.out.println(name);
    components.forEach(component -> component.display(n));
  }
}
