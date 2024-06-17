package pe.edu.vallegrande.Snacker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.Snacker.interfaces.IuProveedor;
import pe.edu.vallegrande.Snacker.model.Proveedor;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService implements ImplProveedor {
    @Autowired
    IuProveedor iuProveedor;

    @Override
    public List<Proveedor> ListarTodo() {
        return iuProveedor.findAll();
    }

    @Override
    public Optional<Proveedor> listarID(Integer id) {
        return iuProveedor.findById(id);
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        return iuProveedor.save(proveedor);
    }

    @Override
    public Proveedor update(Proveedor proveedor, Integer id) {
        return iuProveedor.findById(id).map(res -> {
            res.setNombre(proveedor.getNombre());
            res.setApellido(proveedor.getApellido());
            res.setDireccion(proveedor.getDireccion());
            res.setCelular(proveedor.getCelular());
            res.setEmail(proveedor.getEmail());
            return iuProveedor.save(res);
        }).orElseThrow(() -> new RuntimeException("Provedor no encontrado" + id));
    }

    @Override
    public Proveedor delete(Proveedor proveedor, Integer id) {
        return iuProveedor.findById(id).map(res -> {
            res.setEstado("I");
            return iuProveedor.save(res);
        }).orElseThrow(() -> new RuntimeException(("No se pudo eliminar al proveedor " + id)));
    }

    @Override
    public Proveedor restore(Proveedor proveedor, Integer id) {
        return iuProveedor.findById(id).map(res -> {
            res.setEstado("I");
            return iuProveedor.save(res);
        }).orElseThrow(() -> new RuntimeException(("No se pudo restaurar al proveedor " + id)));
    }
}
