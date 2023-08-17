package modelo;

public class ConvertirTemperatura {
    
    public double celsiusKelvin(double celsius){
        return celsius + 273.15;
    }
    
    public double celsiusFahrenheit(double celsius){
        return (celsius * 9/5 + 32);
    }
    
    public double kelvinCelsius (double kelvin){
        return kelvin - 273.15;
    } 
    
    public double kelvinFahrenheit (double kelvin){
        return 1.8 * (kelvin - 273) + 32;
    }
    
    public double fahrenheitCelsius (double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
    
    public double fahrenheitKelvin (double fahrenheit){
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
    
}
