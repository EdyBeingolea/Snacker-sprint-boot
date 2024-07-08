package pe.edu.vallegrande.Snacker.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import pe.edu.vallegrande.Snacker.model.CompraDetalle;

public interface CompraDetalleImpl {

    public List<CompraDetalle> getAllCompraDetalle();

    public Optional<CompraDetalle> getIdCompraDetalle();

    CompraDetalle save (CompraDetalle compraDetalle);

    CompraDetalle update (CompraDetalle compraDetalle, Integer id);

    CompraDetalle delete (CompraDetalle compraDetalle, Integer id);

    CompraDetalle restore (CompraDetalle compraDetalle, Integer id);

}
