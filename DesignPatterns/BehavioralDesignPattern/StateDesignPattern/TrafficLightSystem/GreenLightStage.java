public class GreenLightStage implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("Green light: Cars can go.");
        context.setState(new YellowLightState());
    }
}
