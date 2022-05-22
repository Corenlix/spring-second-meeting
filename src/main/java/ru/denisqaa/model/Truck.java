package ru.denisqaa.model;

import org.springframework.stereotype.Component;

@Component
public class Truck extends Car {
    @Override
    public String doCarSound() {
        return "braaaaa";
    }
}
