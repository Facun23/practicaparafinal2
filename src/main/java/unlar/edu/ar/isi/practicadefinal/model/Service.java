package unlar.edu.ar.isi.practicadefinal.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.PostConstruct;

public class Service {

    private List <Sucursal> sucursales = new ArrayList<>();
    private List <Cliente> clientes = new ArrayList<>();
    private List <Cuenta> cuentas = new ArrayList<>();

    public void inicializarDatos(){
        Sucursal sucursal1 = new Sucursal("Sucursal centro", "Avenida San Martin 123");
        sucursales.add(sucursal1);

    }


}
