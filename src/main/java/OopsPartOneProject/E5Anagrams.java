package OopsPartOneProject;

import java.util.Arrays;

public class E5Anagrams {

    public static boolean Anagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        // Convert strings to char arrays and sort them
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        //Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning they
        // contain the same characters in a different order. For example, "listen" and "silent" are anagrams.
        String s1 = "listen";
        String s2 = "silent";

        System.out.print("Are the strings anagrams?");
        System.out.println();
        System.out.println( Anagrams(s1, s2));
    }


}
