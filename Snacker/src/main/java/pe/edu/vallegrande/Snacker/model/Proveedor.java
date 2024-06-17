package pe.edu.vallegrande.Snacker.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "suppliers")
@Entity
public class Proveedor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String nombre;
    @Column(name = "lastname")
    private String apellido;
    @Column(name = "address")
    private String direccion;
    @Column(name = "phone")
    private String celular;
    @Column(name = "email")
    private String email;
    @Column(name = "state")
    private String estado;
}
