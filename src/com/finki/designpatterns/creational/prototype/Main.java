package com.finki.designpatterns.creational.prototype;

public class Main {
  public static void main(String[] args) {
    System.out.println(ColorsManager.colors.entrySet().size());
    ColorsManager.getColor("yellow").addColor();
    System.out.println(ColorsManager.colors.entrySet().size());
    Color blue1 = ColorsManager.getColor("blue");
    blue1.addColor();
    System.out.println(blue1);
    System.out.println(ColorsManager.colors.entrySet().size());
    ColorsManager.getColor("yellow").addColor();
    System.out.println(ColorsManager.colors.entrySet().size());
    Color blue = ColorsManager.getColor("blue");
    blue.addColor();
    System.out.println(blue);
    System.out.println(ColorsManager.colors.entrySet().size());
  }
}
