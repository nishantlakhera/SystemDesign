//Adapter class
public class MagneticCardAdapter implements CardReader{
    private MagneticCardReader magneticCardReader;

    public MagneticCardAdapter(MagneticCardReader magneticCardReader){
        this.magneticCardReader = magneticCardReader;
    }
    @Override
    public void readCard() {
        magneticCardReader.swipeCard();
    }

    @Override
    public void validateCard() {
        magneticCardReader.checkMagneticCardValidity();
    }
}
