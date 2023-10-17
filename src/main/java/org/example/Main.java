package org.example;
public class Main {    public static void main(String[] args) {
    String[][] array = {
            {"y", "2", "3", "5"},
            {"8", "13", "21", "34"},
            {"55", "89", "144", "233"},
            {"377", "610", "987", "1597"}
    };
    try {
        System.out.println("Сумма чисел матрицы: " + method(array));
    }
    catch (MyArraySizeException | MyArrayDataException | MyNoFibonacciException e){
        e.printStackTrace();
    }
}
    public static int method(String[][] array) throws MyArraySizeException, MyArrayDataException, MyNoFibonacciException
    {
        if(array.length != 4){
            throw new MyArraySizeException();        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4){
                throw new MyArraySizeException();            }
        }
        int sum = 0;
        int number;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                number = Integer.parseInt(array[i][j]);
                sum += number;
            } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j,array[i][j]);
            }
                try{
                    if(isNoFibonacci(number)){
                    throw new MyNoFibonacciException(i, j, array[i][j]);
                    }
                }                catch (MyNoFibonacciException ee){
                    ee.printStackTrace();
                }
            }
        }        return sum;
    }
    public static boolean isNoFibonacci(int num) {
        int a = 0;
        int b = 1;
        while (a + b <= num) {
            int temp = a + b;
            a = b;
            b = temp;
            if (b == num) {


                return false;
            }
        }
        return true;
    }
}