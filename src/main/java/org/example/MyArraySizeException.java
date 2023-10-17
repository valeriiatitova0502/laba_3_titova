package org.example;

class MyArraySizeException extends Exception{
    public MyArraySizeException() {
        super("Размер матрицы не 4x4!");
    }
}
