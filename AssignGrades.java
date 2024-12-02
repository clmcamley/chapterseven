//Exercise 7.1

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bestScore = 0;

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[] scores = new int[numberOfStudents];

        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        for (int i = 0; i < numberOfStudents; i++) {
            char letterGrade;
            if (scores[i] >= bestScore - 10) {
                letterGrade = 'A';
            } else if (scores[i] >= bestScore - 20) {
                letterGrade = 'B';
            } else if (scores[i] >= bestScore - 30) {
                letterGrade = 'C';
            } else if (scores[i] >= bestScore - 40) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + letterGrade);
        }
    }
}
