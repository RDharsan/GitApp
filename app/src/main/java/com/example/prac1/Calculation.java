package com.example.prac1;

public class Calculation {
    protected float convertCelciusToFahrenheit(Float value){
        Float ans = (value * 9/5) +32;
        return ans;
    }

    protected float convertFajrenheitToCelcius(Float value){
        Float ans = (value - 32) *5/9;
        return ans;
    }
}
