package com.spring;

public class Log {
    public void BeforePrintLog(){
        System.out.println("Before print Log");
    }
    public void AfterPrintLog(){
        System.out.println("After print Log");
    }
    public void AfterReturningPrintLog(){
        System.out.println("After Returning print Log");
    }
    public void print(){
        System.out.println("print Log");
    }
}
