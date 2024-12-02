//Exercise 7.17

import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String[] studentNames = new String[numberOfStudents];

        System.out.print("Enter the students' names separated by spaces: ");
        for (int i = 0; i < numberOfStudents; i++) {
            studentNames[i] = input.next();
        }
        
        int[] studentScores = new int[numberOfStudents];

        System.out.print("Enter the students' scores separated by spaces: ");
        for (int i = 0; i < numberOfStudents; i++) {
            studentScores[i] = input.nextInt();
        }

        for (int i = 0; i < numberOfStudents - 1; i++) {
            for (int j = i + 1; j < numberOfStudents; j++) {
                if (studentScores[j] < studentScores[i]) {
                    int tempScore = studentScores[i];
                    String tempName = studentNames[i];
                    studentScores[i] = studentScores[j];
                    studentNames[i] = studentNames[j];
                    studentScores[j] = tempScore;
                    studentNames[j] = tempName;
                }
            }
        }

        for (int i = 0; i < studentNames.length; i++) {
            System.out.printf("%s ", studentNames[i]);
        }
    }
}