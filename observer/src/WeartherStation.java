import observable.WeatherData;
import views.*;

public class WeartherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Display currentConditions = new CurrentConditionsDisplay(weatherData);
        Display statisticsDisplay = new StatisticsDisplay(weatherData);
        Display forecastDisplay = new ForecastDisplay(weatherData);
        Display heatIndex = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80F, 65F, 30.4F);
        System.out.println("\n");
        weatherData.setMeasurements(82F, 70F, 29.2F);
        System.out.println("\n");
        weatherData.setMeasurements(78F, 90F, 29.2F);
    }
}
