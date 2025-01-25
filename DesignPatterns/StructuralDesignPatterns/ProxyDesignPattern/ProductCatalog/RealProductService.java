//RealSubject
public class RealProductService implements ProductService{
    @Override
    public Product1 getProductById(String productId) {
        System.out.println("Fetching product from database :"+productId);
        return new Product1(productId, "Product", Math.random() * 100);
    }
}
