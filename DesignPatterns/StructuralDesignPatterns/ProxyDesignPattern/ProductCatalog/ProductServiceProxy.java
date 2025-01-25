import java.util.HashMap;
import java.util.Map;

//Proxy
public class ProductServiceProxy implements ProductService{
    private RealProductService realProductService;
    private Map<String, Product1> cache;

    public ProductServiceProxy(){
        this.realProductService = new RealProductService();
        this.cache = new HashMap<>();
    }

    @Override
    public Product1 getProductById(String productId) {
        if(cache.containsKey(productId)){
            System.out.println("Returning product from cache : "+productId);
            return cache.get(productId);
        }

        Product1 product1 = realProductService.getProductById(productId);
        cache.put(productId, product1);
        return product1;
    }

}
