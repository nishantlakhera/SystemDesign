//Concrete Factory
public class AirVehicleFactory implements VehicleFactory{
    @Override
    public LandVehicle createLandVehicle() {
        throw new UnsupportedOperationException("Only air vehicles can be created.");
    }

    @Override
    public AirVehicle createAirVehicle() {
        return new AirPlane();
    }
}
