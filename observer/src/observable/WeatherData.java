package observable;

import java.util.Observable;

public class WeatherData extends Observable {

    private Float temperature;
    private Float humidity;
    private Float pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    ///////////////////////////////////////

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

    public void setMeasurements(Float temperature, Float humidity, Float pressure) {
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
        measurementsChanged();
    }
}
