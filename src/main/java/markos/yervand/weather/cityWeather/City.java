package markos.yervand.weather.cityWeather;


public class City {
    private double temperature;
    private String description;

    private String url;


    public City(double temperature, String description, String url) {
        this.temperature = temperature;
        this.description = description;
        this.url = url;
    }

    // Getters and Setters
    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url)  {
        this.url = url;
    }
}
