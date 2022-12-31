package com.javacource.Homework;

import com.javacource.Homework.Product;

import java.util.HashMap;
import java.util.Map;

    public final class Recipe {
        private final Map<Product, Integer> products = new HashMap<>();
        private final String resipeName;

        public Map<Product, Integer> getProducts() {
            return products;
        }

        public String getResipeName() {
            return resipeName;
        }

        public Recipe(String resipeName) {
            this.resipeName = resipeName;


        }

        public double getTotalCostAllProducts() {
            double totalCostAllProducts = 0.0;
            for (Map.Entry<Product, Integer> product : products.entrySet()) {
                totalCostAllProducts += product.getKey().getPrice() * product.getValue();
            }
            return totalCostAllProducts;

        }

        public void checkProduct(String name) {
            boolean isBought = false;


            for (Map.Entry<Product, Integer> product : products.entrySet()) {
                if (product.getKey().getName().equals(name)) {
                    System.out.println(name + " куплен");
                    isBought = true;
                    break;
                }
            }
            if (!isBought) {
                System.out.println(name + " не куплен");
            }
        }

        public void addProductToList(Product product) {
            if (product == null) {
                return;
            }
            if (this.products.containsKey(product)) {
                Integer productCount = this.products.get(product);
                this.products.put(product, ++productCount);
            } else {
                this.products.put(product, 1);
            }
        }

        public String getRecipeName() {
            return resipeName;
        }

    }
}

