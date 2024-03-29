public class Cat implements Nameable, Ageable, Greetable, OwnerManageable{
    private String name;
    private int age;
    private String ownerName;

    @Override
    public void setName(String name) {
        this.name = name;        
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void greet() {
        System.out.println(GREETING + name + ". Мне " + age + " года(лет). Мой владелец - " + ownerName + ".");
    }

    public void greet(String prefix){
        this.ownerName = ownerName;
    }

    @Override
    public void setOwner(String ownerName) {
        this.ownerName = ownerName;
    }
    @Override
    public String getOwner() {
        return ownerName;
    }
    
    public int compareTo(Cat otherCat) {
        // Сравниваем возраст текущего кота с возрастом другого кота
        return Integer.compare(this.age, otherCat.age);
    }
}
