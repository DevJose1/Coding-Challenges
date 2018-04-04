package palindrome;

import java.util.Scanner;

public class TestPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter your words to check if it is a Palindrome");
        Scanner in = new Scanner(System.in);
        
        String string = in.nextLine();
        String reverse= Palindrome.reverse(string);
        if(reverse.equals(string)) {
        	
        		System.out.println(string+ "is palindrome");
        		
        }else {
			System.out.println(string + "is not a palindrome");
		}


		

	}

}
