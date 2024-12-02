//Exercise 7.15

import java.util.Scanner;

public class EliminateDuplicatesInArray {
    public static void main(String[] args) {
        testEliminateDuplicates();
    }

    public static int[] eliminateDuplicates (int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

        int numberOfDuplicates = 0;

        for (int i = 0, j = i + 1; j < list.length; i++, j++) {
            if (list[j] == list[i]) {
                numberOfDuplicates++;
            }
        }

        int[] newList = new int[(list.length - numberOfDuplicates)];
        newList[0] = list[0];
        for (int j = 1, i = 0; j < list.length; j++) {
            if (list[j] != newList[i]) {
                newList[i + 1] = list[j];
                i++;
            }
        }

        return newList;
    }

    public static void testEliminateDuplicates() {
        int[] originalIntegers = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");

        for (int i = 0; i < 10; i++) {
            originalIntegers[i] = input.nextInt();
        }

        int[] newArray = eliminateDuplicates(originalIntegers);

        System.out.print("The input with duplicates removed is ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("%d ", newArray[i]);
        }
    }
}
