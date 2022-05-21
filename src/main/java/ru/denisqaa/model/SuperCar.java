package ru.denisqaa.model;

import org.springframework.stereotype.Component;

@Component
public class SuperCar extends Car {

  @Override
  public String doCarSound() {
    return "whrooooooooooooooooooooooooooom";
  }
}
