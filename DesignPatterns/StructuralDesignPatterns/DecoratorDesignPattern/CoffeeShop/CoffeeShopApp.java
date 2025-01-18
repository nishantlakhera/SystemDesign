public class CoffeeShopApp {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " Cost :" + coffee.getCost() + " Ru");

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost : "+ coffee.getCost() + " Ru");

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost : "+ coffee.getCost() + " Ru");
    }
}
