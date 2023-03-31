package AssignmentOne.Q2;

import java.util.Scanner;

//  Program to generate prime numbers list, to check armstrong number, perfect number, palindrome
public class Sample {
	// Function to check whether the given number is prime or not
	public static boolean isPrime(int num) {
		if (num < 1)
			return false;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	// Function to print prime numbers from 1 to 100
	public static void printPrimeNumbersBetweenOneToHundred() {
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	// Function to check whether a number is armstrong number
	public static boolean isArmstrongNumber(int number) {// 153
		int length = 0, temp = number, sum = 0;
		while (temp > 0) {
			length++;
			temp /= 10;
		}
		temp = number;
		while (temp > 0) {
			sum += Math.pow(temp % 10, length);
			temp /= 10;
		}
		if (sum == number)
			return true;
		else
			return false;
	}

	// Function to check whether a number is perfect number
	public static boolean isPerfectNumber(int number) {// 496 --1+2+4+8+16+31+62+124+248=496
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number)
			return true;
		else
			return false;
	}

	// Function to check whether a number is a palindrome
	public static boolean isPalindrome(int number) {
		int reverse = 0, temp = number;
		while (temp > 0) {// 92
			reverse = reverse * 10 + temp % 10;// 0+2=2
			temp /= 10;// 9
		}
		if (reverse == number)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Prime numbers between 1 to 100:");
		printPrimeNumbersBetweenOneToHundred();
		System.out.println("\nEnter the number:");
		// To get number from the user
		int number = scanner.nextInt();
		System.out.println(isArmstrongNumber(number) ? "It is an Armstrong Number" : "It is not an Armstrong number");
		System.out.println(isPerfectNumber(number) ? "It is a Perfect Number" : "It is not a Perfect number");
		System.out.println(isPalindrome(number) ? "It is a palindrome" : "It is not a Palindrome");
		scanner.close();
	}
}