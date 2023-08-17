package modelo;

public class Euro implements Conversor{
    
    @Override
    public double pesoMoneda(double valor) {
        return valor/4425.21;
    }

    @Override
    public double monedaPeso(double valor) {
        return valor*4425.21;
    }
}
