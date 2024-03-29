package lecture3.comparable_and_comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2){
        //Сравнение по имени
        return p1.getName().compareTo(p2.getName());
    }
}
