//Observer pattern promotes loose coupling
//Observer and subject knows very less about each other
//Follows open close principle. When new observer added, neither subject nor existing observers impacted
//Subject implements Subject interface
//observers implements observers interface

package observer.com.app;

public class App {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver weatherObserver = new WeatherObserver(0, 0, 0, weatherStation);

        System.out.println(weatherObserver.toString());

        weatherStation.setTemperature(10);
        weatherStation.setHumidity(20);
        weatherStation.setPressure(30);

        System.out.println(weatherObserver.toString());
    }
}

//interface observer
//observer can observe multiple subjects
//observer has to observer subject on creation of observer

//interface Subject
//IT will have list of object, it will notify each object on updation

//Interface observer, Subject
//weather-observer - implement observer
//weatherStation - implement subject

