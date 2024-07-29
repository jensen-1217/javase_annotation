package com.jensen.junit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> cls = Class.forName("com.jensen.junit.JunitDemo");
        Constructor<?> cons = cls.getConstructor();
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)){
                method.invoke(cons.newInstance());
            }
        }
    }
}
