package pe.edu.vallegrande.Snacker.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.Snacker.model.Proveedor;

public interface IuProveedor extends JpaRepository<Proveedor, Integer> {
}
