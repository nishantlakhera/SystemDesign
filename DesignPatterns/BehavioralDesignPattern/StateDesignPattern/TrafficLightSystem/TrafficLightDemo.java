public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext();
        for(int i = 0; i < 6 ; i++){
            trafficLight.changeLight();
            System.out.println(); // Change the light multiple times
        }
    }
}
