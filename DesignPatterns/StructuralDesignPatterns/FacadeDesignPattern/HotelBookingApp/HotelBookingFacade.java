// Facade: Hotel Booking Facade
public class HotelBookingFacade {
    private RoomBooking roomBooking;
    private RestaurentBooking restaurentBooking;
    private PaymentProcessing paymentProcessing;
    private TransportationService transportationService;

    public HotelBookingFacade(){
        this.roomBooking = new RoomBooking();
        this.restaurentBooking = new RestaurentBooking();
        this.paymentProcessing = new PaymentProcessing();
        this.transportationService = new TransportationService();
    }

    public void bookCompletePackage(String roomType, int numberOfPeople, double amount, String transportType){
        System.out.println("Booking a complete package..");
        roomBooking.bookRoom(roomType);
        restaurentBooking.bookTable(numberOfPeople);
        paymentProcessing.processPayment(amount);
        transportationService.bookTransport(transportType);
    }

}
