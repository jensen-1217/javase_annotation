package com.jensen.demo4;

import org.junit.Test;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class BookStoreTest {

    @Test
    public void testParse() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<BookStore> bookStoreClass = BookStore.class;
        BookStore bookStore = bookStoreClass.newInstance();
        Field field = bookStoreClass.getDeclaredField("name");
        field.setAccessible(true);
        if (field.isAnnotationPresent(Book.class)){
            Book book = field.getDeclaredAnnotation(Book.class);
            String bookName = book.value();
            field.set(bookStore,bookName);
        }
        System.out.println(bookStore.getName());
    }
}
