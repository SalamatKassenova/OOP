package lecture3.iterator;

import java.util.*; //содержит классы и интерфейсы для работы с коллекциями.

public class IteratorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // list crration and adding elements
        list.add("apple");
        list.add("banana");
        list.add("orange");

        // Iterator for the list
        Iterator<String> iterator = list.iterator();

        // sort elements with iterator
        while (iterator.hasNext()){ //Начало цикла, проверяющего наличие следующего элемента в списке.
            String fruit = iterator.next(); //Получение следующего элемента из списка.
            System.out.println(fruit);
        }
    }
}