public class YellowLightState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("Yellow Light : Cars must slow down.");
        context.setState(new RedLightState());
    }
}
