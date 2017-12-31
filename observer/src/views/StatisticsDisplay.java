package views;

import interfaces.Subject;

public class StatisticsDisplay extends Display {

    private Float maxTemp = 0.0F;
    private Float minTemp = 200F;
    private Float tempSum = 0.0F;
    private Integer numReadings;

    public StatisticsDisplay(Subject weatherData) {
        super(weatherData);
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Float temp, Float humidity, Float pressure) {
        super.update(temp, humidity, pressure);
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
