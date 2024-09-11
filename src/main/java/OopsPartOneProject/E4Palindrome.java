package OopsPartOneProject;

public class E4Palindrome {
/*
        Check if a String is Palindrome: Determine whether a given string is a palindrome, which mean
        it reads the same forwards and backward. For example, "madam" is a palindrome.
*/
       public boolean palindrome(String a) {
           if (a == null || a.isEmpty()) {
               return false;
           }

           int left = 0;
           int right = a.length() - 1;

           while (left < right) {
               if (a.charAt(left) != a.charAt(right)) {
                   return false;
               }
               left++;
               right--;
           }
           return true;
       }
           public static void main (String[]args) {

           E4Palindrome user = new E4Palindrome();
           user.palindrome("madsssam");
               System.out.println(user);

           }
        }



