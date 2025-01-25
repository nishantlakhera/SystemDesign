//Data Structure
public class Product1 {
    private String id;
    private String name;
    private double price;

    public Product1(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{id='" + id + "', name='" + name + "', price=" + price + "}";
    }

}
