
package com.portfolio.aehwnd.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    private String nombreH;
    private int porcentaje;
    private boolean hard;

    public Habilidad() {
    }

    public Habilidad(String nombreH, int porcentaje, boolean hard) {
        this.nombreH = nombreH;
        this.porcentaje = porcentaje;
        this.hard = hard;
    }
    
    
    
}
