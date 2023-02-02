package ru.yandex.praktikum.model;

import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT_BASIC;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    protected Food (int amount, double price ) {
        this.amount = amount;
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return DISCOUNT_BASIC;
    }
    public double getPrice(){
        return price;
    }
    public double getAmount(){
    return amount;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
