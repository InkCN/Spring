package com.dynamicProxy;

public class User implements Target {
    public void shopping(){
        System.out.println("go to shopping");
    }
    public void work(){
        System.out.println("go to work");
    }
}
