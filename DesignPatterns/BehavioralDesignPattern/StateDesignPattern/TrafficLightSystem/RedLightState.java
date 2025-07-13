public class RedLightState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("Red light : Cars must stop.");
        context.setState(new GreenLightStage());
    }
}
