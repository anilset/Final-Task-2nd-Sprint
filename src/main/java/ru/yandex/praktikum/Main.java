package ru.yandex.praktikum;
import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.service.ShoppingCart;
import static ru.yandex.praktikum.model.constants.Colour.*;

public class Main {
    public static void main(String[] args) {
        Food [] order = new Food[]{
                new Meat(5, 100),
                new Apple(10, RED_COLOUR, 50),
                new Apple(8, GREEN_COLOUR, 60)};

        ShoppingCart cart = new ShoppingCart(order);

        System.out.println( "Yor order details: ");

        for (int i =0; i<order.length; i++) {
            System.out.println( "Item № " + (i+1) + " Quantity: " + order[i].getAmount() + " Price: "
                    + order[i].getPrice() + " Discount " + order[i].getDiscount());
        }

        System.out.println ("Your order amount before 60% discount for red apples: " + ShoppingCart.getTotalAmount());
        System.out.println( "Your order amount after 60% discount for red apples: " + cart.getDiscountedTotal());
        System.out.println("Vegetarian products total amount in your order: " + cart.getVegetarianAmount());
    }
}
