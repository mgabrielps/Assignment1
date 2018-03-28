import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int grade = input.nextInt();
		if(grade > 100 || grade < 0) {
			System.out.println("Error: you must enter a number between 0 and 100.");
		}
		else {
			if(grade >= 90) {
				System.out.println("Student got an A!");
			}
			else if(grade >= 80) {
				System.out.println("Student got a B");
			}
			else if(grade >= 70) {
				System.out.println("Student got a C");
			}
			else if(grade >= 65) {
				System.out.println("Student got a D");
			}
			else {
				System.out.println("Student got an F");
			}
		}
	}

}
