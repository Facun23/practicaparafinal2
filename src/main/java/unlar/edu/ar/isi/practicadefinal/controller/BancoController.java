package unlar.edu.ar.isi.practicadefinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unlar.edu.ar.isi.practicadefinal.Service.BancoService;
import unlar.edu.ar.isi.practicadefinal.model.Cliente;
import java.util.List;


@RestController
public class BancoController {

   @Autowired
    public BancoService service;

    @GetMapping("/clientes")
    public List<Cliente> obtenerClientes(){
        return service.obtenerClientes();
}
}
