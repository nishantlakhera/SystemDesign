import java.util.HashMap;
import java.util.Map;

//Flyweight Factory
public class ProductFactory {
    private static final Map<String, Product> productMap = new HashMap<>();

    public static Product getProduct(String category, String brand){
        String key = category + ":" + brand;
        Product product = productMap.get(key);
        if(product == null){
            product = new ProductCategory(category,brand);
            productMap.put(key,product);
        }
        return product;
    }
}
