import java.util.*;

	public class StudentGrade {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("How many students do you have?");
		int numberOfStudent = scan.nextInt();

		System.out.println("How many subjects do they offer?");
		int numberOfSubjects = scan.nextInt();

		System.out.println("Saving >>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
		System.out.println();

		String[] listOfStudents = new String[numberOfStudent];
		int[] listOfScores;

		for (int i = 0; i < numberOfStudent; i++) {
			System.out.println("Entering score for student " + (i + 1));
			listOfScores = new int[numberOfSubjects];
			for (int j = 0; j < numberOfSubjects; j++) {
				int score;
				do {
					System.out.println("Enter score for subject " + (j + 1));
				while (!scan.hasNextInt()) {
					System.out.println("Please enter a valid integer score.");
					scan.next();
				}
				score = scan.nextInt();
				if (score < 0 || score > 100) {
					System.out.println("Enter a valid score (within 0 to 100)");
				}
				} 
				while (score < 0 || score > 100); 
					listOfScores[j] = score;
			System.out.println("Saving >>>>>>>>>>>>>>>>>>");
			System.out.println("Saved successfully");
			System.out.println();
			}
			
		}
		for (int index = 1; index < numberOfStudent; index++) {
			System.out.println("Student" + index + "\t");
			for(int j = 1; j < numberOfSubjects; j++){
				System.out.print(listOfScores[index][j]);
			}
		}
	}
}
