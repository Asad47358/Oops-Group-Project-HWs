package OopsPartOneProject;

import java.util.*;

public class E10RemoveDublicateArr {
    public static void main(String[] args) {
     //How can you remove all duplicates from ArrayList?
        List<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Cat");
        list.add("Cat");
        list.add("Dog");
        list.add("Dog");
        list.add("Dog");
        list.add("Monkey");
        list.add("Monkey");
        list.add("Monkey");
        list.add("Monkey");
        LinkedHashSet<String> duplicate= new LinkedHashSet<>(list);
        System.out.println(duplicate);


    }
}

