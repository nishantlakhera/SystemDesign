public class TrafficLightContext {
    private TrafficLightState currentState;
    public TrafficLightContext(){
        currentState = new RedLightState(); //Default state
    }

    public void setState(TrafficLightState state){
        this.currentState = state;
    }

    public void changeLight(){
        currentState.handleRequest(this);
    }

}
