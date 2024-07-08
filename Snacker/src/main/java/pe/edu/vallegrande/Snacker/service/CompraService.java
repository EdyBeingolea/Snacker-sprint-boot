package pe.edu.vallegrande.Snacker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.vallegrande.Snacker.model.Compra;
import pe.edu.vallegrande.Snacker.repository.IuCompra;
import pe.edu.vallegrande.Snacker.repository.IuProveedor;

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
