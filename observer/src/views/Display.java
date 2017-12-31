package views;

import interfaces.DisplayElement;
import interfaces.Observer;
import interfaces.Subject;

public abstract class Display implements Observer, DisplayElement {

    private Float temperature;
    private Float humidity;
    private Float pressure;
    private Subject weatherData;

    public Display(Subject weatherData) {
        setWeatherData(weatherData);
    }

    @Override
    public abstract void display();

    @Override
    public void update(Float temp, Float humidity, Float pressure) {
        setTemperature(temp);
        setHumidity(humidity);
        setPressure(pressure);
    }


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

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public Subject getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(Subject weatherData) {
        this.weatherData = weatherData;
    }
}
