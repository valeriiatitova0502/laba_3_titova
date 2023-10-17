package org.example;

public class MyNoFibonacciException extends Exception{
    public MyNoFibonacciException(int i,int j, String value) {
        super("В ячейке массива находится не число Фибоначчи в пределах тысячи: " + value);
    }
}
