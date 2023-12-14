package com.feuji.exception.December12;
import java.util.function.Predicate;
public class PallindromeOrNot {
	  public static void main(String[] args) {
	        String input = "deed"; 
	        Predicate<String> isPalindrome = str -> {
	            String reversed = new StringBuilder(str).reverse().toString();
	            return str.equals(reversed);
	        };

	        if (isPalindrome.test(input)) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }
	    }
	}

	

