package pe.edu.vallegrande.Snacker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table( name = "PURCHASEDETAILS")
public class CompraDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    
    @JoinColumn(name = "purchases_id")
    private Compra compra;

    @Column(name = "products_id")
    private int producto;

    @Column(name = "quantity")
    private int cantidad;

    @Column(name = "unitprice")
    private float precio;

    @Column(name = "subtotal")
    private float total;

}
