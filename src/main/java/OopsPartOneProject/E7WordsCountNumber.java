package OopsPartOneProject;

import java.util.Arrays;

public class E7WordsCountNumber {
    //Count the Number of Words in a String: Write a function to count the number of words in a given string.
    // Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.
    public int countWord(String a){
        String b =a.replaceAll("[,!]"," ").trim();
        String[] words= b.split("  ");
       return words.length;
    }

    public static void main(String[] args) {
        E7WordsCountNumber user = new E7WordsCountNumber();

        System.out.println(user.countWord("Hello, world!"));
    }
}
