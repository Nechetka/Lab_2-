package area;

public class WeatherStatus {
    private static String s = "";
    public static String getWeather(){
        return s;
    }
    public static void setWeather(String w){
        s = w;
    }

}
