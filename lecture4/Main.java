package lecture4;

public class Main {
    public static void main(String[] args) {
        //creating an order for Books
        Order<Book> bookOrder = new Order<>();
        bookOrder.addItem(new Book("abc", 19.99, "Salamat"));
        bookOrder.addItem(new Book("def", 29.99, "John"));
        
        //Output the total price of the book order and list the books
        System.out.println("Books order total: $" + bookOrder.calculateTotalPrice());
        bookOrder.displayOrderItems();

        //Creating an order for electronics
        Order<Electronics> electronicOrder = new Order<>();
        electronicOrder.addItem(new Electronics("phone", 999.99, "Iphone"));
        electronicOrder.addItem(new Electronics("headphones", 199.99, "Iphone"));

        //Output the total price of the electronics and list items
        System.out.println("\nElectronics order total: $" + electronicOrder.calculateTotalPrice());
        electronicOrder.displayOrderItems();
    }
}
