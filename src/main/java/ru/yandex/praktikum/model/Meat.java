package ru.yandex.praktikum.model;
import static ru.yandex.praktikum.model.constants.Discount.*;

public class Meat extends Food {
    public Meat(int amount, double price) {
        super(amount, price);
        isVegetarian = false;
    }

}

