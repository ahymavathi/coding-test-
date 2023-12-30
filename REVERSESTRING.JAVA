package com.studyopedia;

public class stringreverse {

	public static void main(String[] args) {
		scanner scanner =new scanner();
		try {
			System.out.print("enter a string: ");
			String userInput = scanner.nextLine();
			String reversedstring =reverseString(userInput);
			System.out.println("Reverse string:" + reversedstring);
		} catch (NullPointerException e) {
			System.err.println("Error:Input string is null.");
		} catch (StringIndexOutOfBoundException e) {
			System.err.println("Error unable to reverse the string.");
		}finally {
			scanner.close();
		}
	}
	private static String reverseString(String input) {
		if (input == null) {
			throw new NullPointerException("Input string is null");
		}
		StringBuilder reversed = new StringBuilder();
		for (int i = input.length()- 1;i>= 0; i--) {
			reversed.append(input.charAt(i));
		}
		return reversed.toString();
	}