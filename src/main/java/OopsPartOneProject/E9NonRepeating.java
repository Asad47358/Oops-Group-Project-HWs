package OopsPartOneProject;

public class E9NonRepeating {
    // Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating
    // character. For example, in the string "abracadabra", the first non-repeating character is 'c'.

    public void NonRepeat(String a){

        if(a== null || a.isEmpty()){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        E9NonRepeating user = new E9NonRepeating();

        user.NonRepeat("abracadabra");

    }
}
