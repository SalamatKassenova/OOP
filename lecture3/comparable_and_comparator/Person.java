package lecture3.comparable_and_comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }

    public int getAge(){
        return age; 
    }

    public int compareTo(Person other){
        //сравнение по возрасту
        return Integer.compare(this.age, other.age);
    }

    public String toString(){
        return name + " - " + age;
    }
}
