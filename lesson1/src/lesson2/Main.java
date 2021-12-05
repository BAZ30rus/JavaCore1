package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину двумерного массива");
        int x = sc.nextInt();
        System.out.println("Введите ширину двумерного массива");
        int y = sc.nextInt();
        String[][] arr = new String[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Введите значение элемента массива: " + (j + 1) + ":" + (i + 1));
                arr[i][j] = sc.next();
            }
            System.out.println();
        }
        checkArray(arr);
        System.out.println();
    }
    public static void checkArray(String[][] arr){
        try {
            if (arr.length != 4 || arr[0].length != 4) {
                throw new MyArraySizeException();
            }
        } catch (MyArraySizeException e){}

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try{
                    isDigit(arr[i][j], j, i);
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    try {
                        throw new MyArrayDataException();
                    } catch (MyArrayDataException ex){};
                }
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    static boolean isDigit(String s, int x, int y) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Неверные данные в ячейке: " + x + ":" + y);
            return false;
        }
    }

    private static class MyArraySizeException extends Exception {
        MyArraySizeException() {
            this.printStackTrace();
            System.out.println("Ошибка размера массива");
        }
    }

    private static class MyArrayDataException extends Throwable {
        MyArrayDataException() {
            this.printStackTrace();
            System.out.println("Ошибка данных массива");
        }
    }
}
