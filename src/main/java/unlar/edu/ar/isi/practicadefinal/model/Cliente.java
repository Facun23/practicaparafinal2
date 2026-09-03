package unlar.edu.ar.isi.practicadefinal.model;

import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Data
public class Cliente {
    private String nombre;
    private String dni;
    private String email;
    private List<Cuenta> cuentas = new ArrayList<>();

    public  Cliente(String nombre, String dni, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.cuentas = new ArrayList<>();
     }
    

     public void agregarCuenta(Cuenta cuenta){
     this.cuentas.add(cuenta);
    }

}
