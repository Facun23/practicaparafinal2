package unlar.edu.ar.isi.practicadefinal.model;

import lombok.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sucursal {

    private String nombre;
    private String direccion;
    private List<Cliente> clientes;

    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

}
