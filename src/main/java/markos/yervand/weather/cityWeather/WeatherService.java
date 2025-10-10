package markos.yervand.weather.cityWeather;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Map;




    @Service
    public class WeatherService {

        @Value("${weather.api.key}")
        private String apiKey;

        @Value("${weather.api.url}")
        private String apiUrl;


        public void updateCityWeather(Map<String, City> weatherMap) {
            RestTemplate restTemplate = new RestTemplate();

            for (Map.Entry<String, City> entry : weatherMap.entrySet()) {
                String cityName = entry.getKey();
                City city = entry.getValue();

                String url = apiUrl + "?q=" + cityName + "&appid=" + apiKey + "&units=metric";
                Map<String, Object> response = restTemplate.getForObject(url, Map.class);

                Map<String, Object> main = (Map<String, Object>) response.get("main");
                List<Map<String, Object>> weatherList = (List<Map<String, Object>>) response.get("weather");

                double temp = ((Number) main.get("temp")).doubleValue();
                String description = (String) weatherList.get(0).get("description");

                city.setTemperature(temp);
                city.setDescription(description);
            }
        }
    }
