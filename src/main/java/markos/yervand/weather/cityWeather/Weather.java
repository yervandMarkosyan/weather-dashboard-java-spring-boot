package markos.yervand.weather.cityWeather;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.HashMap;


@Component
public class Weather {
    private Map<String, City> weather = new HashMap<>();

    public Weather() {
        weather.put("Brasilia", new City(26.5, "Full sun", "/brasilia.svg"));
        weather.put("Moscow", new City(20.0, "Rainy", "/moscow.svg"));
        weather.put("Yerevan", new City(25.5, "Sunny", "/yerevan.svg"));
        weather.put("Tokyo", new City(22.3, "Heavy rain", "/tokyo.svg"));
    }

    public Map<String, City> getWeather() {
        return this.weather;
    }

    public City getCity(String city) {
        return this.weather.get(city);
    }
}
