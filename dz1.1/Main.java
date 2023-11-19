public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 3);
        Owner owner = new Owner("Алексей");

        cat.setOwner(owner);
        cat.greet();
    }
}


