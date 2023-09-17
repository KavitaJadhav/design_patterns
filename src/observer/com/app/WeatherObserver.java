package observer.com.app;

public class WeatherObserver implements Observer {
    private int temperature;
    private int humidity;
    private int pressure;

    private Subject subject;

    public WeatherObserver(int temperature, int humidity, int pressure, Subject subject) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public String toString() {
        return "Temperature: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure;
    }
}
