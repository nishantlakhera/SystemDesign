public class VehicleFactoryExample {
    public static void main(String[] args) {
        VehicleFactory landFactory = new LandVehicleFactory();
        LandVehicle landVehicle = landFactory.createLandVehicle();
        landVehicle.drive();

        VehicleFactory airFactory = new AirVehicleFactory();
        AirVehicle airVehicle = airFactory.createAirVehicle();
        airVehicle.fly();
    }
}
