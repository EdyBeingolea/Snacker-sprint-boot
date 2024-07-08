package pe.edu.vallegrande.Snacker.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import pe.edu.vallegrande.Snacker.model.Compra;

public interface CompraImpl {

    public List<Compra> getAllCompra();

    Optional<Compra> getIdCompra(Integer id);

    Compra save(Compra compra);

    Compra update (Compra compra , Integer id);

    Compra delete (Compra compra , Integer id);

    Compra restore (Compra compra , Integer id);

}
