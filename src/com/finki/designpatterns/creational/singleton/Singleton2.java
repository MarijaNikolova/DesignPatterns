package com.finki.designpatterns.creational.singleton;

// Lazy loading with double checked locking
public class Singleton2 {
  // the data to be shared between threads
  private static volatile Singleton2 singleton2;

  public static Singleton2 getInstance() {
    if (singleton2 == null) {
      synchronized (Singleton2.class) {
        if (singleton2 == null) {
          singleton2 = new Singleton2();
        }
      }
    }

    return singleton2;
  }
}
