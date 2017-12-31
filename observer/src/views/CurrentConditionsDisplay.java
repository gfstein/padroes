package views;

import interfaces.DisplayElement;
import interfaces.Observer;
import interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Float temperature;
    private Float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        setWeatherData(weatherData);
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + getTemperature() + "F degrees and " + getHumidity() + "% humidity");
    }

    @Override
    public void update(Float temp, Float humidity, Float pressure) {
        setTemperature(temp);
        setHumidity(humidity);
        display();
    }

    ////////////////////////////////////////////////////////////////////


    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Subject getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(Subject weatherData) {
        this.weatherData = weatherData;
    }
}
