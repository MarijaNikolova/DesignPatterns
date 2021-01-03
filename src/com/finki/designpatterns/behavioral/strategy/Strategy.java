package com.finki.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public interface Strategy {

  BigDecimal getTotalPrice(Context context);
}
