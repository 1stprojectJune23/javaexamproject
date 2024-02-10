package Exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNm {



		    public static void main(String[] args) {
		        // Generate 500 random numbers
		        int[] randomNumbers = new int[500];
		        Random random = new Random();
		        for (int i = 0; i < 500; i++) {
		            randomNumbers[i] = random.nextInt(999) + 1; // Random number between 1 and 999
		        }

		        // Sort the array
		        Arrays.sort(randomNumbers);

		        // Ask user for the Nth smallest number
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the value of N for the Nth smallest number: ");
		        int n = scanner.nextInt();

		        // Print the Nth smallest number
		        int nthSmallest = randomNumbers[n - 1];
		        System.out.println("The " + n + "th smallest number is: " + nthSmallest);
		    }
}
