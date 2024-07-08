package pe.edu.vallegrande.Snacker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.vallegrande.Snacker.model.CompraDetalle;
import pe.edu.vallegrande.Snacker.repository.IuCompraDetalle;
import pe.edu.vallegrande.Snacker.service.serviceImpl.CompraDetalleImpl;

@Service
public class CompraDetalleService implements CompraDetalleImpl {

    @Autowired
    private IuCompraDetalle detalle;

    @Transactional(readOnly = true)
    @Override
    public List<CompraDetalle> getAllCompraDetalle() {
        return detalle.findAll();
    }

    @Override
    public Optional<CompraDetalle> getIdCompraDetalle() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getIdCompraDetalle'");
    }

    @Override
    public CompraDetalle save(CompraDetalle compraDetalle) {

        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public CompraDetalle update(CompraDetalle compraDetalle, Integer id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public CompraDetalle delete(CompraDetalle compraDetalle, Integer id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public CompraDetalle restore(CompraDetalle compraDetalle, Integer id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'restore'");
    }

}
