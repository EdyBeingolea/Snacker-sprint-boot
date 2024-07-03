package pe.edu.vallegrande.Snacker.model;

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

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "suppliers_id", referencedColumnName = "id", nullable = false)
    private Proveedor proveedor;

    @Column(name = "total")
    private float total;
}
