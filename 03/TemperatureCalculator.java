
public class TemperatureCalculator {
    
    public static float CelsiusToKelvin(float celsius){
        return (celsius-32)/1.8f;
    }
    
    public static float CelsiusToFahrenheit(float celsius){
        return celsius+273.15f;
    }
    
    public static float KelvinToCelsius(float kelvin){
        return kelvin*1.8f + 32;
    }
    
    public static float KelvinToFahrenheit(float kelvin){
        return (kelvin-273.15f) * 9f / 5f + 32 ;
    }

    public static float FahrenheitToCelsius(float fahrenheit){
        return fahrenheit - 273.15f;
    }
    
    public static float FahrenheitToKelvin(float fahrenheit){
        return (fahrenheit + 459.67f) * 5f / 9f;
    }
}
