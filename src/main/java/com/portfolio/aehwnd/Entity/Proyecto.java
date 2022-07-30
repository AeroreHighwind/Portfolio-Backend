
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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombrePro;
    private String descripcionPro;

    public Proyecto() {
    }

    public Proyecto(String nombrePro, String descripcionPro) {
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
    }
}

