import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter mark (0-100): ");
            double mark = scanner.nextDouble();

            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark.");
                return;
            }

            String grade;
            if (mark >= 80) grade = "A";
            else if (mark >= 70) grade = "B";
            else if (mark >= 60) grade = "C";
            else if (mark >= 50) grade = "D";
            else grade = "F";

            System.out.println("Student: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}

