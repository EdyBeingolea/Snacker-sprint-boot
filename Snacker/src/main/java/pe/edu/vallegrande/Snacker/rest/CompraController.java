package pe.edu.vallegrande.Snacker.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.vallegrande.Snacker.model.Compra;
import pe.edu.vallegrande.Snacker.service.CompraService;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin
@RestController
@RequestMapping("/v1")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping("/Compra")
    public List<Compra> obtenerCompras() {
        return compraService.getAllCompra();
    }
    
}
