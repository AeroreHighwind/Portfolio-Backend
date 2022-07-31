
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
    
    private String imgURL;

    //constructors
    
    public dtoHabilidad() {
    }

    public dtoHabilidad(String nombreH, int porcentaje, boolean hard, String imgURL) {
        this.nombreH = nombreH;
        this.porcentaje = porcentaje;
        this.hard = hard;
        this.imgURL = imgURL;
    }

}
