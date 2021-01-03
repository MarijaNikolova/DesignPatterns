package com.finki.designpatterns.creational.prototype;

public abstract class Color implements Cloneable {

  protected String name;

  public abstract void addColor();

  protected Object clone()  {

    try {
      return super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    return null;
  }
}
