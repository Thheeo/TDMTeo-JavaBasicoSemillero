package com.example.semillero.persistence.entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="estado")
public class EstadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Est_Cod_Estado")
    private Long estCodEstado;

    @Column(name = "Est_Nombre")
    private String estNombre;


    @OneToMany(mappedBy = "estado")
    @JsonManagedReference
    private List<ServicioEntity> servicio;
    public EstadoEntity(){}

    public EstadoEntity(Long estCodEstado){
        this.estCodEstado = estCodEstado;
    }

    public Long getEstCodEstado(){
        return estCodEstado;
    }

    public void setEstCodEstado(Long estCodEstado){
        this.estCodEstado = estCodEstado;
    }

    public String getEstNombre(){
        return estNombre;
    }

    public void setEstNombre(String estNombre){
        this.estNombre = estNombre;
    }

    public List<ServicioEntity> getServicio(){
        return servicio;
    }

    public void setServicio(List<ServicioEntity> servicio){
        this.servicio = servicio;
    }

    @Override
    public String toString(){
        return "EstadoEntity{" +
                "estCodEstado=" + estCodEstado +
                ", estNombre='" + estNombre + '\'' +
                ", servicio=" + servicio +
                '}';
    }
}
