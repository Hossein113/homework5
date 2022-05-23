package com.homework.jdbc.example.domain;

public class OfficalShoe extends Shoes {

    private String followingLayerType;

    public OfficalShoe(int id, String name, String madeIn, int price, int number, int size, String material, String color, String followingLayerType) {
        super(id, name, madeIn, price, number, size, material, color);
        this.followingLayerType = followingLayerType;
    }

    public OfficalShoe(String name, String madeIn, int price, int number, int size, String material, String color, String followingLayerType) {
        super(name, madeIn, price, number, size, material, color);
        this.followingLayerType = followingLayerType;
    }

    public String getFollowingLayerType() {
        return followingLayerType;
    }

    public void setFollowingLayerType(String followingLayerType) {
        this.followingLayerType = followingLayerType;
    }

    @Override
    public String toString() {
        return "OfficalShoe{" +
                "followingLayerType='" + followingLayerType + '\'' +
                "} " + super.toString();
    }
}
