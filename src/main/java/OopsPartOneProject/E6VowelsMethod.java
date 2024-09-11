package OopsPartOneProject;

public class E6VowelsMethod {

    //Create a method to count how many vowels are present in a string “documentation”

    public int Vowels(String a){
        int num=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='o' || a.charAt(i)=='u' || a.charAt(i)=='e' || a.charAt(i)=='a' || a.charAt(i)=='i'){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        E6VowelsMethod user = new E6VowelsMethod();
       int a = user.Vowels("documentation");
        System.out.println(a);

    }
}
