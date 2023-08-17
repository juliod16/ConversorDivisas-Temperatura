package modelo;


public class Libras implements Conversor{
    
    @Override
    public double pesoMoneda(double valor) {
        return valor/5112.14;
    }

    @Override
    public double monedaPeso(double valor) {
        return valor*5112.14;
    }
}
