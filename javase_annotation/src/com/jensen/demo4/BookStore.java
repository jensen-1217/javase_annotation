package com.jensen.demo4;

public class BookStore {
    @Book("Java入门")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
