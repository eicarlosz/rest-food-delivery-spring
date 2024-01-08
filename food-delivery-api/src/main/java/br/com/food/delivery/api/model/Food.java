package br.com.food.delivery.api.model;

import java.io.Serializable;

//@Entity
//@Table
public class Food implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long foodId;
    private String name;
    private double price;
    //private Estabelecimento Estabelecimento;

    public Food() {}

    public Food(Long foodId, String name, double price) {
        this.foodId = foodId;
        this.name = name;
        this.price = price;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
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
}
