package org.example;

public class Food extends Product {
    private String expirationDate;

    public Food(String name, String id, double price, String expirationDate) {
        super(name, id, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Food [" + getName() + ", id: " + getId() + ", цена: " + getPrice()
                + ", годен до: " + expirationDate + "]";
    }
}
