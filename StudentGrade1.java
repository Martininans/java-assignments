import java.util.*;

public class StudentGrade1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many students do you have?");
        int numberOfStudents = scan.nextInt();

        System.out.println("How many subjects do they offer?");
        int numberOfSubjects = scan.nextInt();

        System.out.println("Saving >>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");
        System.out.println();

        String[] subjects = new String[numberOfSubjects];
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter the name of subject " + (i + 1));
            subjects[i] = scan.next();
        }

        int[][] listOfScores = new int[numberOfStudents][numberOfSubjects];

      
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Entering scores for student " + (i + 1));
            for (int j = 0; j < numberOfSubjects; j++) {
                int score;
                do {
                    System.out.println("Enter score for " + subjects[j] + " for student " + (i + 1));
                    while (!scan.hasNextInt()) {
                        System.out.println("Please enter a valid integer score.");
                        scan.next();
                    }
                    score = scan.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("Enter a valid score (within 0 to 100)");
                    }
                } while (score < 0 || score > 100);
                listOfScores[i][j] = score;
			System.out.println("Saving >>>>>>>>>>>>>>>>>>");
			System.out.println("Saved successfully");
			System.out.println();
            }
           
        }

        // Print table headers
        System.out.print("STUDENT\t\t\t");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("SUB" + (i+1) + "\t");
        }
        System.out.println("Total\tAverage\tPosition");

        // Print scores by student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + "\t\t");
            int total = 0;
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print(listOfScores[i][j] + "\t");
                total += listOfScores[i][j];
            }
            double average = (double) total / numberOfSubjects;
            System.out.printf("%d\t%.2f\t%d%n", total, average, i + 1);
        }
    }
}
