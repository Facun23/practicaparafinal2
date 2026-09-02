package unlar.edu.ar.isi.practicadefinal.model;

import lombok.*;
import java.util.List;
import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Sucursal {

    private String nombre;
    private String direccion;
    private List<Cliente> clientes;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

}
