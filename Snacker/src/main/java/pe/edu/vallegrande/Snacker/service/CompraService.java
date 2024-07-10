package pe.edu.vallegrande.Snacker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.vallegrande.Snacker.model.Compra;
import pe.edu.vallegrande.Snacker.repository.IuCompra;
import pe.edu.vallegrande.Snacker.service.serviceImpl.CompraImpl;

@Service
public class CompraService implements CompraImpl{


    @Autowired
    private IuCompra iuCompra;

    @Transactional(readOnly = true)
    @Override
    public List<Compra> getAllCompra() {
        return iuCompra.findAll();
    }

    @Override
    public Optional<Compra> getIdCompra(Integer id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'getIdCompra'");
    }

    @Override
    public Compra save(Compra compra) {
       
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Compra update(Compra compra, Integer id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Compra delete(Compra compra, Integer id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Compra restore(Compra compra, Integer id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'restore'");
    }
}
