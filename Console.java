import java.util.PriorityQueue;
import java.util.Scanner;

public class SimpleScoreTracker {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Score Tracker");
        System.out.println("---------------------");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a score");
            System.out.println("2. Get the lowest score");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a score: ");
                    int score = scanner.nextInt();
                    minHeap.add(score);
                    System.out.println("Score added!");
                    break;

                case 2:
                    if (minHeap.isEmpty()) {
                        System.out.println("No scores available.");
                    } else {
                        System.out.println("Lowest score: " + minHeap.peek());
                    }
                    break;

                case 3:
                    System.out.println("Exiting Simple Score Tracker. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
