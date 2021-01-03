package com.finki.designpatterns.behavioral.observer.simple;

public class Main {

  public static void main(String[] args) {
    Subject subject = new Subject();
    new ObserverOne(subject);
    new ObserverTwo(subject);

    subject.setState(3);

    subject.setState(2);
  }
}
