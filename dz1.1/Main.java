public class Main {

    public static void main(String[] args) {
        //создание объекта кота и хозяина
        Cat1 cat = new Cat1("Барсик", 3);
        Owner1 owner = new Owner1("Алексей");

        //установка оунера для кота и вывод приветствия
        cat.setOwner(owner);
        cat.greet();
    }
}


