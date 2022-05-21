package ru.denisqaa.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CarShop {
  private final Car car;

  public void whatSoundCarMakes() {
    System.out.println("Car sounds: ");
    System.out.println(car.doCarSound());
    System.out.println("At: ");
    System.out.println(new Timer().getCurrentDate());
    System.out.println();
  }
}
