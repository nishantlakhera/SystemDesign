public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceProxy();

        //First request (cache miss)
        System.out.println(productService.getProductById("101"));

        //Second request (cache hit)
        System.out.println(productService.getProductById("101"));

        System.out.println(productService.getProductById("102"));

    }

}
