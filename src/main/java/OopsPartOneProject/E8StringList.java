package OopsPartOneProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E8StringList {
    //You have a list of Strings and you want to keep only those that start with "A" and you want to return
    // them in lower case.
        public static void main(String[] args) {

            List<String> strings = new ArrayList<>();
                strings.add("Apple");
                strings.add("Banana");
                strings.add("Avocado");
                strings.add("Cherry");
                strings.add("Apricot");
            List<String> STLower = new ArrayList<>();
                for (String s:strings) {
                    if (s.startsWith("A")){
                        STLower.add(s.toLowerCase());
                    }
                }
           for (String a:STLower){
               System.out.println(a);
           }
    }

}
