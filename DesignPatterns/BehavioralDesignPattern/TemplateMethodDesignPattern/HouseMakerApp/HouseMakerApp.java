public class HouseMakerApp {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        //using template methods
        houseType.buildHouse();

        System.out.println("************");

        houseType = new GlassHouse();
        houseType.buildHouse();

    }
}
