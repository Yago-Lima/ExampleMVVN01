package com.example.examplemvvn01;

public class Calculadora {
    public double calcular(double v1, double v2, String op){
        switch (op){
            case "+":
                return v1+v2;
            case "-":
                return v1-v2;


            case "*":
                return v1*v2;


            case "/":
                return v1/v2;


            default: throw new IllegalArgumentException("operador Inválido");
        }//switch
    }//method
}//class
