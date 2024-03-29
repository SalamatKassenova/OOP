package lecture3.iterable;

public class CustomIterableExample{
    public static void main(String[] args) {
        MyIterable iterable = new MyIterable();
        iterable.add(1);
        iterable.add(2);
        iterable.add(3);

        // for-each for sorting elements from own class
        for (int num : iterable){
            System.out.println(num);
        }
    }
}
