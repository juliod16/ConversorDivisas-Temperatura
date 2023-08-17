package modelo;

public class Dolar implements Conversor{
    
    @Override
    public double pesoMoneda(double valor) {
        return valor/3976.53;
    }

    @Override
    public double monedaPeso(double valor) {
        return valor*3976.53;
    }
    
}
