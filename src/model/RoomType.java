package com.oceanview.model;

public enum RoomType {
    STANDARD(8000),
    DELUXE(12000),
    SUITE(20000);

    private final double rate;

    RoomType(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}