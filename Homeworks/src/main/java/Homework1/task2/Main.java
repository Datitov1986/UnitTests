package Homework1.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Butter", 120));
        products.add(new Product("Milk", 80));
        products.add(new Product("Cream", 200));
        Shop shop = new Shop(products);
        System.out.println("Shop: " + shop.getProducts());
        System.out.println("Products sorted by price: " + shop.sortProductsByPrice());
        System.out.println("Most expensive product: " + shop.getMostExpensiveProduct());
    }
}