public class Cat{
    private String name;
    private int age;
    private Owner owner;
    
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
   }

   public String getName(){
    return name;
   }

   public void setName(String name){
    this.name = name;
   }

   public int getAge(){
    return age;
   }

   public void setAge(int age){
    this.age = age;
   }

   public Owner getOwner(){
    return owner;
   }

   public void setOwner(Owner owner){
    this.owner = owner;
   }

   public void greet(){
    String message = "Мяу! Меня зовут " + name + ". Мне " + age + " года(лет).";
    if (owner != null){
        message += " Мой владелец - " + owner.getName() + ".";
    }
    System.out.println(message);
   }
    
}
