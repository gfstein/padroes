package views;

import observable.WeatherData;

import java.util.Observable;

public class ForecastDisplay extends Display {

    private Float currentPressure = 29.92f;
    private Float lastPressure;

    public ForecastDisplay(Observable weatherData) {
        super(weatherData);
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure.equals(lastPressure)) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////


    public Float getCurrentPressure() {
        return currentPressure;
    }

    public void setCurrentPressure(Float currentPressure) {
        this.currentPressure = currentPressure;
    }

    public Float getLastPressure() {
        return lastPressure;
    }

    public void setLastPressure(Float lastPressure) {
        this.lastPressure = lastPressure;
    }
}
