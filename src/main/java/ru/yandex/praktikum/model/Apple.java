package ru.yandex.praktikum.model;

import static ru.yandex.praktikum.model.constants.Colour.*;
import static ru.yandex.praktikum.model.constants.Discount.*;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, String colour, double price) {
        super(amount, price);
        this.colour = colour;
        isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        return colour.equals(RED_COLOUR)? DISCOUNT_RED_APPLE:DISCOUNT_BASIC;
    }
}


