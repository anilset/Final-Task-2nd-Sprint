package ru.yandex.praktikum.service;
import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private Food[] order;

    public ShoppingCart(Food[] order) {
        this.order = order;
    }
    public double getTotalAmount() {
        double totalAmount = 0;
        for (Food item: order) {
            totalAmount += item.getPrice() * item.getAmount();
        } return totalAmount;
    }

    public double getDiscountedTotal() {
        double totalAmount = 0;
        for (Food item: order) {
            totalAmount += item.getAmount() * (item.getPrice() / 100 * (100 - item.getDiscount()));
        }
        return totalAmount;
    }
    public double getVegetarianAmount() {
        double totalAmount = 0;
        for (Food item : order) {
            if (item.isVegetarian()) {
                totalAmount += item.getPrice() * item.getAmount();
            }
        } return totalAmount;
    }
}




