package views;

import java.util.Observable;

public class CurrentConditionsDisplay extends Display {

    public CurrentConditionsDisplay(Observable weatherData) {
        super(weatherData);
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        super.update(o, arg);
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + getTemperature() + "F degrees and " + getHumidity() + "% humidity");
    }
}
