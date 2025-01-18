public class HotelApplication {
    public static void main(String[] args) {
        HotelBookingFacade hotelBookingFacade = new HotelBookingFacade();
        hotelBookingFacade.bookCompletePackage("Deluxe", 2, 500.00, "Car");
    }
}
