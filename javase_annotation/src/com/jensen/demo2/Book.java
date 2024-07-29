package com.jensen.demo2;

public @interface Book {
    public String value();
    public double price() default 99.0;
    public String[] author();
}
