package com.practise;

public class PalindromeTest {


	public static void main(String args[]) {
		System.out.println("Is aaa palindrom?: " + isPalindromString("aaa"));
		System.out.println("Is abc palindrom?: " + isPalindromString("abc"));

		System.out.println("Is bbbb palindrom?: " + isPalindromString("bbbb"));
		System.out.println("Is defg palindrom?: " + isPalindromString("defg"));


	}

	/**
	 * Java method to check if given String is Palindrome
	 * @param text
	 * @return true if text is palindrome, otherwise false
	 */
	public static boolean isPalindromString(String text){
		String reverse = reverse(text);
		if(text.equals(reverse)){
			return true;
		}

		return false;
	}

	/**
	 * Java method to reverse String using recursion
	 * @param input
	 * @return reversed String of input
	 */
	public static String reverse(String input){
		if(input == null || input.isEmpty()){
			return input;
		}
		//        String str="mrinmay";
		//        System.out.println("str :" + str.substring(0, str.length() - 5));
		//        System.out.println("input :" + input);
		//        System.out.println("input.length()" + input.length());
		//        System.out.println("input.charAt(input.length()- 1) :" + input.charAt(input.length()- 1) );
		//       System.out.println("input.substring(0, input.length() - 1) :" + input.substring(0, input.length() - 1));
		System.out.println("input :" + input);
		String str=input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1));
		System.out.println("final string :" + str);
		return str	;
	}

}
