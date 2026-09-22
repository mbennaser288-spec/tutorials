import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "task.txt";

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("===== ADD TASKS =====");
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter Task " + i + ": ");
                String task = scanner.nextLine().trim();
                tasks.add(task);
            }
        }

        System.out.println("\n===== TASK LIST =====");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
            System.out.println("\nTasks saved successfully.");
        } catch (IOException e) {
            System.out.println("Unable to save tasks: " + e.getMessage());
        }

        System.out.println("\n===== TASKS LOADED FROM FILE =====");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Unable to load tasks: " + e.getMessage());
        }
    }
}

