package pe.edu.vallegrande.Snacker.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "purchases")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fecha")
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "suppliers_id")
    private Proveedor proveedor;

    @Column(name = "total")
    private float total;

    @OneToMany(mappedBy = "compra")
    @JsonIgnore
    private List<CompraDetalle> compraDetalle;
}
