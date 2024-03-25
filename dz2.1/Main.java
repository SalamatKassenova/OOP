public class Main {public static void main(String[] args) {
    // Создаем объект кота
    Cat cat = new Cat();
    cat.setName("Барсик");
    cat.setAge(4);
    cat.setOwner("Алиса");
    
    // Создаем объект владельца
    Owner owner = new Owner();
    owner.setName("Алиса");

    // Приветствие кота
    cat.greet(); // Базовое приветствие с именем, возрастом и владельцем
    
    // Перегруженное приветствие
    cat.greet("Внимание! "); // Перегруженное приветствие с префиксом

    // Демонстрация работы с владельцем
    System.out.println("Имя владельца: " + owner.getName());
    
    // Демонстрация default метода из интерфейса Nameable
    System.out.println("Полное имя кота: " + cat.getFullName());
}
}

