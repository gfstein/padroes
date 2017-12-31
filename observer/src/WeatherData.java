import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.Collection;

public class WeatherData implements Subject {

    private Float temperature;
    private Float humidity;
    private Float pressure;
    private Collection<Observer> observers;

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        setObserver(o);
    }

    @Override
    public void removeObserver(Observer o) {
        getObservers().remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getTemperature(), getHumidity(), getPressure());
        }
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

    public Collection<Observer> getObservers() {
        return observers;
    }

    public void setObservers(Collection<Observer> observers) {
        this.observers = observers;
    }

    private void setObserver(Observer o) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(o);
    }

    public void setMeasurements(Float temperature, Float humidity, Float pressure) {
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
        measurementsChanged();
    }
}
