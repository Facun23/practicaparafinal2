package unlar.edu.ar.isi.practicadefinal.model;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CajeroAutomatico {

    private String ubicacion;

    public double consultarSaldo(Cuenta cuenta){
        return cuenta.consultarSaldo();
    }


}
