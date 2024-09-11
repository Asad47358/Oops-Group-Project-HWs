package OopsPartOneProject;

public class E3ReverseString {
    public void revers(String a){
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {

        //Reverse a String: Write a function to reverse a given string. For example, given the input "Hello",
        // the output should be "olleH".
E3ReverseString user=new E3ReverseString();

        user.revers("hello");



    }
}
