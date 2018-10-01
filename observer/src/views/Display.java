package views;

import interfaces.DisplayElement;
import observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

public abstract class Display implements Observer, DisplayElement {

    private Float temperature;
    private Float humidity;
    private Float pressure;
    private Observable weatherData;

    public Display(Observable weatherData) {
        setWeatherData(weatherData);
    }

    @Override
    public abstract void display();

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            setPressure(weatherData.getPressure());
            setHumidity(weatherData.getHumidity());
            setTemperature(weatherData.getTemperature());
        }
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

    public Observable getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(Observable weatherData) {
        this.weatherData = weatherData;
    }
}
