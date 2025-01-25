//Concrete Flyweight
public class ProductCategory implements Product{
    private final String category;
    private final String brand;

    public ProductCategory(String category, String brand){
        this.category = category;
        this.brand = brand;
    }

    @Override
    public void displayProductDetails(String price, String stock) {
        System.out.println("Product category: " +category+ ", Brand: "+brand+ ", Price: "+price+ ", Stock: "+stock);
    }
}
