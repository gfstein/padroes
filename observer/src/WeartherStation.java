import views.CurrentConditionsDisplay;
import views.Display;
import views.ForecastDisplay;
import views.StatisticsDisplay;

public class WeartherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Display currentConditions = new CurrentConditionsDisplay(weatherData);
        Display statisticsDisplay = new StatisticsDisplay(weatherData);
        Display forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80F, 65F, 30.4F);
        weatherData.setMeasurements(82F, 70F, 29.2F);
        weatherData.setMeasurements(78F, 90F, 29.2F);
    }
}
