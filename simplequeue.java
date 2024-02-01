package queue;

import java.util.ArrayList;
import java.util.InputMismatchException; 
import java.util.Scanner;

public class simplequeue {
	 private ArrayList<String> queueList = new ArrayList<>();
	    private Scanner scanner = new Scanner(System.in);

	    public void enqueue() {
	        System.out.print("Enter element to enqueue: ");
	        queueList.add(scanner.nextLine());
	        System.out.println("Enqueued successfully!");
	    }

	    public void dequeue() {
	        if (queueList.isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	        } else {
	            System.out.println("Dequeued: " + queueList.remove(0));
	        }
	    }

	    public void displayQueue() {
	        System.out.println("Current Queue: " + queueList);
	    }

	    public static void main(String[] args) {
	        simplequeue myQueue = new simplequeue();

	        int choice = -1; // Initialize choice with a default value
	        do {
	            try {
	                System.out.println("\nQueue Menu");

	                System.out.println("1. Welcome to java");
	                System.out.println("2. Enqueue");
	                System.out.println("3. Dequeue");
	                System.out.println("4. Display Queue");
	                System.out.println("0. Exit");
	                System.out.print("Enter your choice: ");

	                choice = myQueue.scanner.nextInt();
	                myQueue.scanner.nextLine();

	                switch (choice) {
	                    case 1:
	                        myQueue.enqueue();
	                        break;
	                    case 2:
	                        myQueue.dequeue();
	                        break;
	                    case 3:
	                        myQueue.displayQueue();
	                        break;
	                    case 0:
	                        System.out.println("Exiting the program. Bye!");
	                        break;
	                    default:
	                        System.out.println("Invalid choice. Please enter a valid option.");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Invalid input. Please enter a valid integer.");
	                myQueue.scanner.nextLine();
	            }
	        } while (choice != 0);

	        myQueue.scanner.close();
	    }
}


