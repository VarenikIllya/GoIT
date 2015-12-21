package module4.sub_2;

/**
 * Created by i on 21.12.15.
 */
public class TemperatureHelper {
    public static double fahrenheitToCelsius(double tempInFahrenheit){
        return (tempInFahrenheit - 32 ) * 1.8 ;
    }
    public static double celsiusToFahrenheit(double tempInCelsuis){
        return (tempInCelsuis * 1.8) + 32;
    }
}
