package modelo;


public class Yen implements Conversor{
    
    @Override
    public double pesoMoneda(double valor) {
        return valor/28.05;
    }

    @Override
    public double monedaPeso(double valor) {
        return valor*28.05;
    }
}
