package com.finki.designpatterns.creational.singleton;

/**
 * With on demand holder.
 */
public class Singleton4 {
  private Singleton4() {

  }

  /**
   * SingletonHolder is loaded on the first execution of the getInstance - not before.
   *
   */
  private static class SingletonHolder {
    public static final Singleton4 INSTANCE = new Singleton4();
  }

  // thread safe
  // does not prevent creating classes with reflection
  public static Singleton4 getInstance() {
    return SingletonHolder.INSTANCE;
  }
}
