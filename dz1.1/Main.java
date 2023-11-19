public class Main {

    public static void main(String[] args) {
        //создание объекта кота и хозяина
        Cat cat = new Cat("Барсик", 3);
        Owner owner = new Owner("Алексей");

        //установка оунера для кота и вывод приветствия
        cat.setOwner(owner);
        cat.greet();
    }
}


