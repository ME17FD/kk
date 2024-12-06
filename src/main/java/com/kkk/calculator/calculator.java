package com.kkk.calculator;

import java.util.HashSet;
import java.util.Set;

public class calculator {
    
    public static Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> chiffres = new HashSet<>();
        String nombreStr = String.valueOf(Math.abs(pNombre)); 
        for (char c : nombreStr.toCharArray()) {
            chiffres.add(Character.getNumericValue(c)); 
        }
        return chiffres;
    }

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