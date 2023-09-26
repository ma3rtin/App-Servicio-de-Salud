package com.cg.servicioSalud.entidades;

import com.cg.servicioSalud.enumeracion.Estado;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;


@Entity
@Data
class Turno {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @OneToOne
    private Profesional profesional;
    
    @OneToOne
    private Paciente paciente;
    
    @Enumerated(EnumType.STRING)
    private Estado estado;
    
    private String motivo;
    
    private Double precioFinal;
}
