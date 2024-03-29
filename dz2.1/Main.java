public class Main {
    public static void main(String[] args) {
        // Создаем объект Owner
        Owner owner = new Owner();
        owner.setName("John");

        // Создаем объекты Cat
        Cat cat1 = new Cat();
        cat1.setName("Whiskers");
        cat1.setAge(5);
        cat1.setOwner("John");

        Cat cat2 = new Cat();
        cat2.setName("Fluffy");
        cat2.setAge(3);
        cat2.setOwner("John");

        // Вызываем методы объекта Cat
        cat1.greet(); // Выведет: Мяу! Меня зовут Whiskers. Мне 5 года(лет). Мой владелец - John.
        cat2.greet(); // Выведет: Мяу! Меня зовут Fluffy. Мне 3 года(лет). Мой владелец - John.

        // Вызываем методы объекта Owner
        //System.out.println(owner.getName()); // Выведет: John

        // Сравниваем возраст котов
        int comparisonResult = cat1.compareTo(cat2);

        if (comparisonResult > 0) {
            System.out.println(cat1.getName() + " старше " + cat2.getName() + ".");
        } else if (comparisonResult < 0) {
            System.out.println(cat1.getName() + " младше " + cat2.getName() + ".");
        } else {
            System.out.println("Возрасты котов равны.");
        }
    }
}

