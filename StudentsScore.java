import java.util.Scanner;
public class StudentsScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of students: ");
		String[] students = new String[input.nextInt()];
		int[] scores = new int[students.length];
		System.out.println("Please enter the name and score for each student:");
		for (int i = 0; i < students.length; i++) {
			System.out.print("Student " + (i + 1) + ": ");
			students[i] = input.next();
			System.out.print("Score: ");
			scores[i] = input.nextInt();
		}
		sortDecreasingOrder(students, scores);
		for (String e: students) {
			System.out.println(e);
		}
	}
	
	public static void sortDecreasingOrder(String[] strs, int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			int max = numbers[i];
			int maxIndex = i;
			String temp;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] > max) {
					max = numbers[j];
					maxIndex = j;
				}
			}
			
			if (maxIndex != i) {
				// Swap string array
				temp = strs[i];
				strs[i] = strs[maxIndex];
				strs[maxIndex] = temp;

				// Swap integer array
				numbers[maxIndex] = numbers[i];
				numbers[i] = max;
			}
		}
	}
}

