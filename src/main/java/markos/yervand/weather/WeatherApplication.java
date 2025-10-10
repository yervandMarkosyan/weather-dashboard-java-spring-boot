package markos.yervand.weather;

import markos.yervand.weather.cityWeather.Weather;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class WeatherApplication {

	public static final Logger log = LoggerFactory.getLogger(WeatherApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

	@Bean
	CommandLineRunner cityWeather() {
        return args -> {
            Weather weather = new Weather();
            log.info("Initialized weather object: {}", weather);
        };
	}

}
