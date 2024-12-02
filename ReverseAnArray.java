//Exercise 7.12

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        testReverse();
    }

    public static int[] reverse (int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }

    public static void testReverse() {
        Scanner input = new Scanner(System.in);
        int[] numberArray = new int[10];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            numberArray[i] = input.nextInt();
        }

        int[] reversedArray = new int[10];
        reversedArray = reverse(numberArray);

        System.out.print("The reverse of your input is ");
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d ", reversedArray[i]);
        }
    }
}
