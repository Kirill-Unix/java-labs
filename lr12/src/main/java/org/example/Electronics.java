package org.example;

public class Electronics extends Product {
    private int warranty;

    public Electronics(String name, String id, double price, int warranty) {
        super(name, id, price);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public String toString() {
        return "Electronics [" + getName() + ", id: " + getId() + ", цена: " + getPrice()
                + ", гарантия: " + warranty + " мес.]";
    }
}
