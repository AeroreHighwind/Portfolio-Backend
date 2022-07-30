
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

public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEdu;
    private String descripcionEdu;

    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE) {
        this.nombreEdu = nombreE;
        this.descripcionEdu = descripcionE;
    }
}
