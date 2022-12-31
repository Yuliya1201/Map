package com.javacource.Homework;


import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int weight;


    public Product(String name,double price,int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return Double.compare(product.price,price) == 0 && weight == product.weight &&
                Objects.equals(name,product.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }


    @Override
    public String toString() {
        return "Продукт: " + name + " / Цена: " + price + " рублей" + " / Вес: " + weight +
                " килограмм";


    }
}

