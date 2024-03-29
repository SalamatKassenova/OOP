package lecture3.comparable_and_comparator;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 20));
        people.add(new Person("Charlie", 30));

        // Сортировка с использованием Comparable (по возрасту)
        bubbleSortByAge(people);
        System.out.println("Sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Сортировка с использованием Comparator (по имени)
        bubbleSortByName(people);
        System.out.println("\nSorted by name:");
        for (Person person : people) {
            System.out.println(person);
        }
    }

        // Метод сортировки пузырьком по возрасту
    private static void bubbleSortByAge(List<Person> people) {
        int n = people.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (people.get(j).getAge() > people.get(j + 1).getAge()) {
                    // Обмен элементов
                    Person temp = people.get(j);
                    people.set(j, people.get(j + 1));
                    people.set(j + 1, temp);
                
                }
            }
        }
    }

    // Метод сортировки пузырьком по имени
    private static void bubbleSortByName(List<Person> people) {
        int n = people.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (people.get(j).getName().compareTo(people.get(j + 1).getName()) > 0) {
                    // Обмен элементов
                    Person temp = people.get(j);
                    people.set(j, people.get(j + 1));
                    people.set(j + 1, temp);
                }
            }
        }
    }
}

