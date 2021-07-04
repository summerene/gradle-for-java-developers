package productapplication;

public class Product {
    String name;
    String description;
    String price;

    public Product() {
        this.name = "O'Keeffe's Workiong Hands Hand Cream, 3.4oz jar";
        this.description = "This concentrated hand cream heals, releaves, and repairs extremely dry, cracked hands.";
        this.price = "$6.98";
    }

    public String toString() {
        StringBuilder sb = new

        StringBuilder(250);
        sb.append("The product is:\n");
        sb.append(name + "\n");
        sb.append(description + "\n");
        sb.append("The product price is: " + price);
        return sb.toString();
    }
}