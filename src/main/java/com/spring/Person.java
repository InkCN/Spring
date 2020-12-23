package com.spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
@Data
public class Person {
    @Value(value = "张三")
    private String name;
    @Value(value = "18")
    private int age;
}
