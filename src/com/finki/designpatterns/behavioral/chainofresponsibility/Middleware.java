package com.finki.designpatterns.behavioral.chainofresponsibility;

/**
 * https://refactoring.guru/design-patterns/chain-of-responsibility/java/example.
 */
public abstract class Middleware {

  private Middleware next;

  /**
   * Builds chains of middleware objects.
   */
  public Middleware linkWith(Middleware next) {
    this.next = next;
    return next;
  }

  /**
   * Subclasses will implement this method with concrete checks.
   */
  public abstract boolean check(String email, String password);

  /**
   * Runs check on the next object in chain or ends traversing if we're in
   * last object in chain.
   */
  protected boolean checkNext(String email, String password) {
    if (next == null) {
      return true;
    }
    return next.check(email, password);
  }
}
