public class City {
    private String cityId;
    private String cityName;
    private String country;
    private double area;
    public City() {

    }
    public City(String cityId, String cityName, String country, double area) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.country = country;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
