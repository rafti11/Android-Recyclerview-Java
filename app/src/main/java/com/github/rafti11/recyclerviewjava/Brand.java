package com.github.rafti11.recyclerviewjava;


public class Brand {

    private String name;
    private int logo;

    public Brand(String name, int logo){
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
