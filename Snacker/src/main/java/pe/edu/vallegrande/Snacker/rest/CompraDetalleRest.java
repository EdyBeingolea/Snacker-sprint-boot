package pe.edu.vallegrande.Snacker.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.vallegrande.Snacker.model.CompraDetalle;
import pe.edu.vallegrande.Snacker.service.CompraDetalleService;

@CrossOrigin
@RestController
@RequestMapping("/v1")
public class CompraDetalleRest {

    @Autowired
    private CompraDetalleService service;

    @GetMapping("/CompraDetalle")
    public List<CompraDetalle> getAllCompraDetalle(){
        return service.getAllCompraDetalle();
    }
}
