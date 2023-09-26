package com.cg.servicioSalud.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;


@Entity
@Data
public class Calendario {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;
    
    @OneToOne
    private Profesional profesional;
    
    @OneToMany
    private List <Turno> turnos;
    
}
