package pe.edu.vallegrande.Snacker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.vallegrande.Snacker.interfaces.IuCompra;
import pe.edu.vallegrande.Snacker.interfaces.IuProveedor;
import pe.edu.vallegrande.Snacker.model.Compra;

@Service
public class CompraService {

    @Autowired
    private IuProveedor iuProveedor;

    @Autowired
    private IuCompra iuCompra;

    @Transactional(readOnly = true)
    public List<Compra> obtenerCompras() {
        return iuCompra.findAll();
    }
}
