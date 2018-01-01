package views;

import observable.WeatherData;

import java.util.Observable;

public class StatisticsDisplay extends Display {

    private Float maxTemp = 0.0F;
    private Float minTemp = 200F;
    private Float tempSum = 0.0F;
    private Integer numReadings = 0;

    public StatisticsDisplay(Observable weatherData) {
        super(weatherData);
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            Float temp = ((WeatherData) o).getTemperature();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }

    public void display() {
        System.out.println("StatisticsDisplay: Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    ///////////////////////////////////////////////////////////////////////////////////


    public Float getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Float maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Float getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Float minTemp) {
        this.minTemp = minTemp;
    }

    public Float getTempSum() {
        return tempSum;
    }

    public void setTempSum(Float tempSum) {
        this.tempSum = tempSum;
    }

    public Integer getNumReadings() {
        return numReadings;
    }

    public void setNumReadings(Integer numReadings) {
        this.numReadings = numReadings;
    }
}
