package com.cg.servicioSalud.entidades;

import com.cg.servicioSalud.enumeracion.Modalidad;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Profesional extends Usuario{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name= "uuid", strategy = "uuid2")
    protected String id;
    private Double reputacion;
    
    @OneToMany
    private List <Disponibilidad> disponibilidad;
    
    @Enumerated(EnumType.STRING)
    private Modalidad modalidad;
    
    private String ubicacion;
    
    @OneToMany
    private List <String> obrasSociales;
    
    private String especialidad;
    
    private Double tarifa;
    
    private Boolean estado; //true = alta  - false = baja
}
