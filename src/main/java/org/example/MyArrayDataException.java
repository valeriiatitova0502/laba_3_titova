package org.example;

class MyArrayDataException extends Exception{
    public MyArrayDataException(int row, int col, String value) {
        super("В ячейке массива [" + (row+1) + ", " + (col+1) + "] лежит не число " + value);
    }
}
