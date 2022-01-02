//Binta Ceesaynding Gassama
//4x4 Integer Matrix Operations with Random Numbers

import java.util.*;

public class MatrixOperations {

    public static void main(String[] args) {
        Random Mixed = new Random();

        int[][] array1 = new int[4][4];
        System.out.println("First Matrix:");

        //fill the array with random number
        for (int i = 0; i < 4; i++) {
            System.out.print('[');
            for (int j = 0; j < 4; j++) {
                array1[i][j] = 1 + Mixed.nextInt(30);

                //print the first matrix
                System.out.print(array1[i][j] + " ");
            }
            System.out.println(']');
            System.out.println();
        }
        System.out.println("******************************");
        System.out.println("Transpose of First Matrix:");
        for (int i = 0; i < 4; i++) {
            System.out.print('[');
            for (int j = 0; j < 4; j++) {

                System.out.print(array1[j][i] + " ");
            }
            System.out.println(']');
            System.out.println();
        }
        int[][] array2 = new int[4][4];

        System.out.println("Second Matrix:");

        //fill the array with random number
        for (int i = 0; i < 4; i++) {
            System.out.print('[');
            for (int j = 0; j < 4; j++) {
                array2[i][j] = 1 + Mixed.nextInt(30);

                //print the second matrix
                System.out.print(array2[i][j] + " ");
            }
            System.out.println(']');
            System.out.println();

        }
        System.out.println("********************************");
        System.out.println("Transpose of Second Matrix:");
        for (int i = 0; i < 4; i++) {
            System.out.print('[');
            for (int j = 0; j < 4; j++) {

                System.out.print(array2[j][i] + " ");
            }
            System.out.println(']');
            System.out.println();
        }
        int[][] sum = new int[4][4];
        System.out.println("Summation:");
        for (int i = 0; i < 4; i++) {
            System.out.print('[');
            for (int j = 0; j < 4; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];

                System.out.print(sum[i][j] + " ");
            }
            System.out.println(']');
            System.out.println();

        }
        System.out.println("Subtraction:");
        for(int i = 0; i < 4; i++) {
            System.out.print('[');
            for(int j = 0; j < 4; j++) {
                sum[i][j] = array1[i][j] - array2[i][j];

                System.out.print(sum[i][j] + " ");
            }
            System.out.println(']');
            System.out.println();
        }

        System.out.println("Multiplication:");
        for(int i = 0; i < 4; i++){
            System.out.print('[');
            for(int j = 0; j < 4; j++){
                sum[i][j] = array1[i][j] * array2[i][j];

                System.out.print(sum[i][j] + " ");
            }
            System.out.println(']');
            System.out.println();
        }

    }
}
