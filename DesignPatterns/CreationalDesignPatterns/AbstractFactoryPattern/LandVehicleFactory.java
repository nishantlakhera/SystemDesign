//Concrete Factory
public class LandVehicleFactory implements VehicleFactory{

    @Override
    public LandVehicle createLandVehicle() {
        return new Car();
    }

    @Override
    public AirVehicle createAirVehicle() {
        throw new UnsupportedOperationException("Only land vehicles can be created.");
    }
}
