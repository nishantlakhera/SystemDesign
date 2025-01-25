public class FlyweightECommerceDemo {
    public static void main(String[] args) {
        Product phone = ProductFactory.getProduct("Electronics", "Samsung");
        phone.displayProductDetails("50000", "50");

        Product laptop = ProductFactory.getProduct("Electronics", "Mac");
        laptop.displayProductDetails("100000","40");
    }
}
