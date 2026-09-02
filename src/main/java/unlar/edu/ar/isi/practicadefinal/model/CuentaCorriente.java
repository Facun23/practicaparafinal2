package unlar.edu.ar.isi.practicadefinal.model;

public class CuentaCorriente extends Cuenta{
    private double limiteDescubierto;
    private double saldo;

    public CuentaCorriente(String cbu, double saldo, double limiteDescubierto) {
        super(cbu, saldo);
        this.limiteDescubierto = limiteDescubierto;
        this.saldo = saldo;

    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void extraer(double monto) {
        saldo -= monto;
    }
}
