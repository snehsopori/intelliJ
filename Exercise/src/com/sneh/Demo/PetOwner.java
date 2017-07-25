package com.sneh.Demo;

public class PetOwner {
    private String name;
    private String pet;
    private int cost;

    public PetOwner(String name, String pet, int cost) {
        this.name = name;
        this.pet = pet;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
