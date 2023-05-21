package com.kaygen;
import java.util.Arrays;
public class FilterString {
	
	    public static void main(String[] args) {
	        String[] numbers = { "Hello", "23", "42", "World", "74", "23" };
	        Arrays.stream(numbers)
	              .filter(s -> isNumeric(s))
	              .map(Integer::parseInt)
	              .filter(n -> n % 2 == 0)
	              .forEach(System.out::println);
	    }
	    
	    public static boolean isNumeric(String str) { 
	        try {  
	            Integer.parseInt(str);  
	            return true;
	        } catch(NumberFormatException e){  
	            return false;  
	        }  
	    }
	}

