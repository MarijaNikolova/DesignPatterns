package com.finki.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorsManager {

  public static Map<String, Color> colors = new HashMap<>();

  static {
    colors.put("yellow", new YellowColor());
    colors.put("blue", new BlueColor());
  }

  public static Color getColor(String name) {
    return (Color) colors.get(name).clone();
  }
}
