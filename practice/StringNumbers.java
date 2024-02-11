package com.training.practice;

public class StringNumbers {
	//Find the characters
	public static boolean
    onlyDigits(String str, int n) 
    { 
        // Traverse the string from 
        // start to end 
        for (int i = 0; i < n; i++) { 
 
            // Check if character is 
            // not a digit between 0-9 
            // then return false
            if (str.charAt(i) < '0'
                || str.charAt(i) > '9') { 
                return false; 
            } 
        } 
          // If we reach here, that means 
          // all characters were digits.
        return true; 
    } 
 
    // Driver Code 
    public static void main(String args[]) 
    { 
        // Given string str 
        String str = "59234"; 
        int len = str.length(); 
 
        // Function Call 
        System.out.println(onlyDigits(str, len)); 
    } 
}
