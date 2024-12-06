package com.kkk.calculator;
public class calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    public static  float  divide(float a,float b){
        if(b!=0){
        return (a/b);}
        else{
            return Float.NaN;
        }
    }
}
class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}