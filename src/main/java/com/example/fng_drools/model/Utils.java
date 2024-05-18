package com.example.fng_drools.model;

public class Utils {
    public static boolean isNumeric(String input) {
        // Check each character in the input string
        for (char c : input.toCharArray()) {
            // If the character is not a digit, return false
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        // If all characters are numeric, return true
        return true;
    }
    
    public static boolean validateWarrantyCodePattern(String input) {
        // Define the regular expression pattern
        // The pattern requires the first three characters to be digits (\d{3})
        // and the last three characters to be letters ([a-zA-Z]{3})
        String pattern = "^\\d{3}[a-zA-Z]{3}$";

        // Validate the input string against the pattern
        return input.matches(pattern);
    }

}
