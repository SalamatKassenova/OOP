package dz4;

public class Main2 {
    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        String[] stringArray = {"Hello", "gb", "it", "world"};

        System.out.println("Elements of integer array: ");
        printArray(intArray);

        System.out.println("Elements of string array: ");
        printArray(stringArray);
    }
}
