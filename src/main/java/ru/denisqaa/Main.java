package ru.denisqaa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.denisqaa.configuration.AppConfiguration;
import ru.denisqaa.model.CarShop;

public class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(AppConfiguration.class);
    for (int i = 0; i < 5; i++) {
      CarShop bean =
          applicationContext.getBean(CarShop.class);
      bean.whatSoundCarMakes();
    }
  }

}
