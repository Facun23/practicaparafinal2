package unlar.edu.ar.isi.practicadefinal.model;

import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Cuenta {
    private String cbu;
    private double saldo;
    private List <Movimiento> historial;
    
    public void registrarMovimiento(Movimiento movimiento){
        this.historial.add(movimiento);
    }
    public List<Movimiento> getHistorial(){
        return historial;
    }

    public abstract void extraer(double monto);
    public abstract void depositar(double monto);
    public abstract double consultarSaldo();


}
