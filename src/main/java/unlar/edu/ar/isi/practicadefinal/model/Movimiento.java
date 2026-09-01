package unlar.edu.ar.isi.practicadefinal.model;
import java.time.LocalDate;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Movimiento{

    private LocalDate fecha;
    private double monto;
    private String detalle;
    



}
