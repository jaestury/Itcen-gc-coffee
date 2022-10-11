package com.example.gccoffee.controller;

import com.example.gccoffee.model.OrderItem;

import java.util.List;
import java.util.Objects;

public final class CreateOrderRequest {
    private final String email;
    private final String address;
    private final String postcode;
    private final List<OrderItem> orderItems;

    CreateOrderRequest(String email, String address, String postcode, List<OrderItem> orderItems) {
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.orderItems = orderItems;
    }

    public String email() {
        return email;
    }

    public String address() {
        return address;
    }

    public String postcode() {
        return postcode;
    }

    public List<OrderItem> orderItems() {
        return orderItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateOrderRequest that = (CreateOrderRequest) o;
        return email.equals(that.email) && address.equals(that.address) && postcode.equals(that.postcode) && orderItems.equals(that.orderItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, address, postcode, orderItems);
    }
}
