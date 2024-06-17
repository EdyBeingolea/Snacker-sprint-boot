package pe.edu.vallegrande.Snacker.service;

import pe.edu.vallegrande.Snacker.model.Proveedor;

import java.util.List;
import java.util.Optional;

public interface ImplProveedor {
    List<Proveedor> ListarTodo();

    Optional<Proveedor> listarID(Integer id);

    Proveedor save(Proveedor proveedor);

    Proveedor update(Proveedor proveedor, Integer id);

    Proveedor delete(Proveedor proveedor, Integer id);

    Proveedor restore(Proveedor proveedor, Integer id);
}
