package com.jensen.demo1;

@MyAnnotation(name="测试")
public class TestAnnotation {
    @MyAnnotation(name="数据",price = 123)
    private String name;


    @MyAnnotation(name = "构造方法")
    public TestAnnotation(){
    }

    @MyAnnotation(name = "成员方法",price = 100)
    public void method(@MyAnnotation(name = "参数") String msg){
    }
}
