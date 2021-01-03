package com.finki.designpatterns.creational.singleton;

/**
 * Eager loading.
 */
public class Singleton3 {
  // the instance cannot be redefined
  // the instance won't be constructed until the class is called.
  private static final Singleton3 singleton3 = new Singleton3();

  private Singleton3() {

  }

  public static Singleton3 getInstance() {
    return singleton3;
  }
}
