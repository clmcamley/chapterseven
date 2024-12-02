//Exercise 7.8

import java.util.Scanner;

public class AverageAnArray {
    public static void main(String[] args) {
        testAverages();
    }

    public static double average (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        return average;
    }

    public static double average (double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        return average;
    }

    public static void testAverages() {
        Scanner input = new Scanner(System.in);
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            intArray[i] = input.nextInt();
        }

        System.out.println("The average of the 10 integers is " + average(intArray));

        System.out.print("Enter 10 doubles: ");
        for (int i = 0; i < 10; i++) {
            doubleArray[i] = input.nextDouble();
        }

        System.out.println("The average of the 10 doubles is " + average(doubleArray));
    }
}