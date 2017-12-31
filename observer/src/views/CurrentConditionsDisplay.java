package views;

import interfaces.Subject;

public class CurrentConditionsDisplay extends Display {

    public CurrentConditionsDisplay(Subject weatherData) {
        super(weatherData);
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Float temp, Float humidity, Float pressure) {
        super.update(temp, humidity, pressure);
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + getTemperature() + "F degrees and " + getHumidity() + "% humidity");
    }
}
