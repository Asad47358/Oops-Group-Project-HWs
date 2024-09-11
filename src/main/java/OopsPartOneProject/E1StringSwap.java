package OopsPartOneProject;

public class E1StringSwap {
    public void swap(String s1, String s2){
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.print(s1+" ");
        System.out.print(s2);
    }
    public static void main(String[] args) {
        //Write a program to swap 2 String without a temporary variable?
        // Initialize strings
        E1StringSwap user=new E1StringSwap();
        user.swap("hello","world");
    }
}

