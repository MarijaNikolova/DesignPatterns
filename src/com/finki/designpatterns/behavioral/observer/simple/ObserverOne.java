package com.finki.designpatterns.behavioral.observer.simple;

public class ObserverOne extends Observer {

  public ObserverOne(Subject subject) {
    this.subject = subject;
    subject.add(this);
  }

  @Override
  public void update() {
    System.out.println(String.format("Observer 1 was updated %d", subject.getState()));
  }
}
