package lecture3.iterator;

import java.util.*;

public class IteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //iterator for the list
        Iterator<Integer> iterator = numbers.iterator();

        //sort elements and remove even numbers
        while (iterator.hasNext()){
            int number = iterator.next();
            if (number % 2 == 0){
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
    
}