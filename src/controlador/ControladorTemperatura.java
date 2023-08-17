package controlador;

import modelo.ConvertirTemperatura;

public class ControladorTemperatura {
    
    public double resultado;
    public String temperatura;
    
    public ControladorTemperatura(int opcion, double valorConvetir){
        ConvertirTemperatura convertir = new ConvertirTemperatura();
        
        switch(opcion){
            case 0 -> { 
                this.temperatura = "°Fahrenheit";
                this.resultado = convertir.celsiusFahrenheit(valorConvetir);
            }
            case 1 -> { 
                this.temperatura = "°Kelvin";
                this.resultado = convertir.celsiusKelvin(valorConvetir);
            }
            case 2 -> { 
                this.temperatura = "°Celsius";
                this.resultado = convertir.fahrenheitCelsius(valorConvetir);
            }
            case 3 -> { 
                this.temperatura = "°Kelvin";
                this.resultado = convertir.fahrenheitKelvin(valorConvetir);
            }
            case 4 -> { 
                this.temperatura = "°Celsius";
                this.resultado = convertir.kelvinCelsius(valorConvetir);
            }
            case 5 -> { 
                this.temperatura = "°Fahrenheit";
                this.resultado = convertir.kelvinFahrenheit(valorConvetir);
            }
        }
    }
}
