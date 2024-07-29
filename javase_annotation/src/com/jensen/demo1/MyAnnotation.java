package com.jensen.demo1;

public @interface MyAnnotation {
    public String name();
    public double price() default 99.0;
}
