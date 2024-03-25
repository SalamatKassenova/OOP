public interface Nameable {
    void setName(String name);
    String getName();

    //Default method
    default String getFullName(){
        return "Mr./Ms. " + getName();
    }
}
