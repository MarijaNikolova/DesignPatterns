package com.finki.designpatterns.behavioral.observer.simple;

public class ObserverTwo extends Observer {

  public ObserverTwo(Subject subject) {
    this.subject = subject;
    subject.add(this);
  }

  @Override
  public void update() {
    System.out.println(String.format("Observer 2 was updated %d", subject.getState()));
  }
}
