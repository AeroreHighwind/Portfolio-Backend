
package com.portfolio.aehwnd.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class dtoHabilidad {
    @NotBlank
    private String nombreH;
    
    @NotBlank
    private int porcentaje;
    
    @NotBlank
    private boolean hard;

    //constructors
    
    public dtoHabilidad() {
    }

    public dtoHabilidad(String nombreH, int porcentaje, boolean hard) {
        this.nombreH = nombreH;
        this.porcentaje = porcentaje;
        this.hard = hard;
    }

}
