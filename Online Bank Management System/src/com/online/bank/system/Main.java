package com.online.bank.system;


	import java.io.*;
	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) throws IOException {
	        intro();
	    }

	    private static void intro() throws IOException {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("┌───────────────────────────────┐");
	        System.out.println("│ Welcome to SawOnGam Bank Ltd. │");
	        System.out.println("├───────────────────────────────┤");
	        System.out.println("│ Type 1: Login                 │");
	        System.out.println("│ Type 2: Create Account        │");
	        System.out.println("└───────────────────────────────┘");
	        int choiceAcc = scanner.nextInt();
	        if (choiceAcc == 1) loginAcc();
	        else if (choiceAcc == 2) createAcc();
	        else {
	            System.out.println("Incorrect! Choose a valid option again.");
	            intro();
	        }
	    }

		private static void createAcc() {
			System.out.println("your account create here");
			
		}

		private static void loginAcc() {
			System.out.println("login here");
			
			
		}

		public static void menu(int accNo) {
			System.out.println("accNo here");
		
			
		}


}
