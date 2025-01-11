public class CardReaderSystem {
    public static void main(String[] args) {
        MagneticCardReader magneticCardReader = new MagneticCardReader();
        ChipCardReader chipCardReader = new ChipCardReader();

        CardReader magneticAdapter = new MagneticCardAdapter(magneticCardReader);
        CardReader chipAdapter = new ChipCardReaderAdapter(chipCardReader);

        System.out.println("Using Magnetic card reader:");
        magneticAdapter.readCard();
        magneticAdapter.validateCard();

        System.out.println("Using Chip card reader:");
        chipAdapter.readCard();
        chipAdapter.validateCard();

    }
}
