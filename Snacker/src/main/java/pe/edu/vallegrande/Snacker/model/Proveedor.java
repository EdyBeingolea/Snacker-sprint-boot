package pe.edu.vallegrande.Snacker.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "suppliers")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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

    @Column(name = "type_document")
    private String documento;

    @Column(name = "number_document")
    private String documentoN;

    @Column(name = "state")
    private String estado;

    @OneToMany(mappedBy = "proveedor")
    @JsonIgnore
    private List<Compra> compra;
}
