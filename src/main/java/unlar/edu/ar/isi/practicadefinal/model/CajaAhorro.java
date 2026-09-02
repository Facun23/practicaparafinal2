package unlar.edu.ar.isi.practicadefinal.model;

public class CajaAhorro extends Cuenta {

    private double tasaInteres;
    private double saldo;

    public CajaAhorro(String cbu, double saldo, double tasaInteres){

        super(cbu, saldo);
        this.saldo = saldo;
        this.tasaInteres = tasaInteres; 

    }

    public double getTasaInteres() {
        return tasaInteres;
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

    public void aplicarInteres(){
        double ganancia = this.consultarSaldo() * this.tasaInteres;
        this.depositar(ganancia);
    }

    

}
