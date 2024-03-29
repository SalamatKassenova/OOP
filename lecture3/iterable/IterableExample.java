package lecture3.iterable;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        //for-each for sorting elemenets of the list
        for (String fruit : list){
            System.out.println(fruit);
        }
    }
}
