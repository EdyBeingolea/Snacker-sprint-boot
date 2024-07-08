package pe.edu.vallegrande.Snacker.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.Snacker.model.Proveedor;
import pe.edu.vallegrande.Snacker.service.ProveedorService;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/v1")
public class ProveedorController {

    @Autowired
    ProveedorService service;

    @GetMapping("Proveedor")
    public ResponseEntity<List<Proveedor>> listar(){
        return ResponseEntity.ok(service.ListarTodo());
    }

    @GetMapping("Proveedor/{id}")
    public ResponseEntity<Optional<Proveedor>> listarId(@PathVariable Integer id){
        return ResponseEntity.ok(service.listarID(id));
    }

    @PostMapping("Proveedor")
    public  ResponseEntity<Proveedor> guardar(@RequestBody Proveedor proveedor){
        return  ResponseEntity.ok(service.save(proveedor));
    }

    @PutMapping("Proveedor/{id}")
    public ResponseEntity<Proveedor> update(@RequestBody Proveedor proveedor,@PathVariable Integer id){
        return  ResponseEntity.ok(service.update(proveedor,id));
    }

    @PutMapping("Proveedor/Eliminar/{id}")
    public ResponseEntity<Proveedor> eliminar(@RequestBody Proveedor proveedor,@PathVariable Integer id){
        return  ResponseEntity.ok(service.delete(proveedor,id));
    }
    @PutMapping("Proveedor/Restaurar/{id}")
    public ResponseEntity<Proveedor> restaurar(@RequestBody Proveedor proveedor,@PathVariable Integer id){
        return  ResponseEntity.ok(service.restore(proveedor,id));
    }


}
