package dz4;

public class Main1 {
    
    public static <T> void printElement(T element){
        System.out.println(element);
    }

    public static void main(String[] args) {
        printElement(10);
        printElement("GB");
        printElement(2.2);
    }
}
