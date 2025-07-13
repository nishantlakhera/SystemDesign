public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phone = new PhoneDisplay();
        TvDisplay tv = new TvDisplay();

        weatherStation.addObserver(phone);
        weatherStation.addObserver(tv);

        weatherStation.setWeather("Sunny");
    }
}
