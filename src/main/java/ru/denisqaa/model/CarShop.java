package ru.denisqaa.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarShop {
  private final Car car;
  private final Timer timer;

  @Autowired
  public CarShop(@Qualifier("truck") Car car, Timer timer) {
    this.car = car;
    this.timer = timer;
  }

  public void whatSoundCarMakes() {
    System.out.println("Car sounds: ");
    System.out.println(car.doCarSound());
    System.out.println("At: ");
    System.out.println(timer.getCurrentDate());
    System.out.println();
  }
}
