package com.example.gccoffee.model;

import java.util.Objects;
import java.util.UUID;

public final class OrderItem {
    private final UUID productId;
    private final Category category;
    private final long price;
    private final int quantity;

    OrderItem(UUID productId, Category category, long price, int quantity) {
        this.productId = productId;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public UUID productId() {
        return productId;
    }

    public Category category() {
        return category;
    }

    public long price() {
        return price;
    }

    public int quantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (OrderItem) obj;
        return Objects.equals(this.productId, that.productId) &&
                Objects.equals(this.category, that.category) &&
                this.price == that.price &&
                this.quantity == that.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, category, price, quantity);
    }

    @Override
    public String toString() {
        return "OrderItem[" +
                "productId=" + productId + ", " +
                "category=" + category + ", " +
                "price=" + price + ", " +
                "quantity=" + quantity + ']';
    }

}
