//Adapter class
public class EuropeanToUSAdapter extends EuropeanPlug implements USPlug{
    @Override
    public void usePlug() {
        useEuropeanPlug();
    }
}
