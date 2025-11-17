class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    void displayInfo() {
        System.out.println("Product: " + name + " Price: " + price);
    }
}
class Electronics extends Product {
    int warranty;
    Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }
    @Override
    void displayInfo() {
        System.out.println("Electronics: " + name + " Price: " + price + " Warranty: " + warranty + " years");
    }
}
class Book extends Product {
    String author;

    Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }
    @Override
    void displayInfo() {
        System.out.println("Book: " + name + " Price: " + price + " Author: " + author);
    }
}
public class Q2 {
    public static void main(String[] args) {
        Product p1 = new Electronics("Laptop", 55000, 2);
        Product p2 = new Book("Java Basics", 299, "James Gosling");
        p1.displayInfo();
        p2.displayInfo();
    }
}
