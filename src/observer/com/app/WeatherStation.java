package observer.com.app;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private int temperature;
    private int humidity;
    private int pressure;

    private List<Observer> weatherObservers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        weatherObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        weatherObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        weatherObservers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyObservers();
    }
}
