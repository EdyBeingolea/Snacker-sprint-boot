package pe.edu.vallegrande.Snacker.service.serviceImpl;

import pe.edu.vallegrande.Snacker.model.Proveedor;

import java.util.List;
import java.util.Optional;

public interface ProveedorImpl {
    
    List<Proveedor> ListarTodo();

    Optional<Proveedor> listarID(Integer id);

    Proveedor save(Proveedor proveedor);

    Proveedor update(Proveedor proveedor, Integer id);

    Proveedor delete(Proveedor proveedor, Integer id);

    Proveedor restore(Proveedor proveedor, Integer id);
}
