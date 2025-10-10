package markos.yervand.weather.cityWeather;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {


    @Autowired
    private WeatherService weatherService;

    @Autowired
    private Weather weather;

    @PostConstruct
    public void init() {
        weatherService.updateCityWeather(weather.getWeather());
    }

    @GetMapping
    public String getHome() {
        return "home";
    }
    @GetMapping("/weather")
    public String getWeather(@RequestParam(required=false) String city, Model model) {
        model.addAttribute("cities", weather.getWeather());
        model.addAttribute("selectedCity", city != null ? weather.getCity(city) : null);
        model.addAttribute("selectedName", city);
        return "weather";
    }

}
