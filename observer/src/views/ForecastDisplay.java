package views;

import interfaces.Subject;

public class ForecastDisplay extends Display {

    private Float currentPressure = 29.92f;
    private Float lastPressure;

    public ForecastDisplay(Subject weatherData) {
        super(weatherData);
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Float temp, Float humidity, Float pressure) {
        super.update(temp, humidity, pressure);
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
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
