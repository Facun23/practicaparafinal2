package unlar.edu.ar.isi.practicadefinal.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import unlar.edu.ar.isi.practicadefinal.model.CajaAhorro;
import unlar.edu.ar.isi.practicadefinal.model.Cliente;
import unlar.edu.ar.isi.practicadefinal.model.Cuenta;
import unlar.edu.ar.isi.practicadefinal.model.CuentaCorriente;
import unlar.edu.ar.isi.practicadefinal.model.Sucursal;

@Service
public class BancoService {

    private List <Sucursal> sucursales = new ArrayList<>();
    private List <Cliente> clientes = new ArrayList<>();
    private List <Cuenta> cuentas = new ArrayList<>();
    
    @PostConstruct
    public void inicializarDatos(){

        Sucursal sucursal1 = new Sucursal("Sucursal centro", "Avenida San Martin 123");
        sucursales.add(sucursal1);
        Sucursal sucursal2 = new Sucursal("Sucursal Sur", "Avenida Rivadavia 456");
        sucursales.add(sucursal2);
        //CREAR CLIENTES
        Cliente cliente1 = new Cliente("Facundo Gaetan", "46788652", "jfgaetan553@gmail.com");
        clientes.add(cliente1);
        Cliente cliente2 = new Cliente("Juan Perez", "12345678", "juanperezexample@mail.com");
        clientes.add(cliente2);
        Cliente cliente3 = new Cliente("Maria Lopez", "87654321", "marialopezexample@mail.com");
        clientes.add(cliente3);
        //AGREGAR CLIENTES A SUCURSALES
        sucursal1.agregarCliente(cliente1);
        sucursal2.agregarCliente(cliente3);
        sucursal1.agregarCliente(cliente2);
        //CREAR CUENTAS 
        Cuenta cuenta1 = new CajaAhorro("12349750193730",100000.02,3.2 );
        cuentas.add(cuenta1);
        Cuenta cuenta2 = new CuentaCorriente("12637236198269", 50000000.67, 25.777);
        cuentas.add(cuenta2);
        //AGREGAR CLIENTES A CUENTAS
        cliente1.agregarCuenta(cuenta1);
        cliente2.agregarCuenta(cuenta2);
    }

    //METODO GET CLIENTES
    public List<Cliente> obtenerClientes(){
        return clientes;
    }

}
