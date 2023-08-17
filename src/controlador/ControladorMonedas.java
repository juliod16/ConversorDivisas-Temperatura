package controlador;

import modelo.*;


public class ControladorMonedas {
    
    public double resultado;
    public String tipoMoneda;
    
    public ControladorMonedas(int opcion, double valorConvertir){
        Dolar dolar = new Dolar();
        Euro euro = new Euro();
        Libras libra = new Libras();
        Yen yen = new Yen();
        
        switch(opcion){
            case 0 -> {
                this.tipoMoneda = "USD";
                this.resultado = dolar.pesoMoneda(valorConvertir);
            }
            case 1 -> {
                this.tipoMoneda = "EUR";
                this.resultado = euro.pesoMoneda(valorConvertir);
            }
            case 2 -> { 
                this.tipoMoneda = "GBP";
                this.resultado = libra.pesoMoneda(valorConvertir);
            }
            case 3 -> {
                this.tipoMoneda = "JPY";
                this.resultado = yen.pesoMoneda(valorConvertir);
            }
            case 4 -> {
                this.tipoMoneda = "COP";
                this.resultado = dolar.monedaPeso(valorConvertir);
            }
            case 5 -> {
                this.tipoMoneda = "COP";
                this.resultado = euro.monedaPeso(valorConvertir);
            }
            case 6 -> {
                this.tipoMoneda = "COP";
                this.resultado = libra.monedaPeso(valorConvertir);
            }
            case 7 -> { 
                this.tipoMoneda = "COP";
                this.resultado = yen.monedaPeso(valorConvertir);
            }
        }
    }
}
