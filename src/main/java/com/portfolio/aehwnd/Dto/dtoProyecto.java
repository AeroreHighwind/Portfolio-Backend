
package com.portfolio.aehwnd.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class dtoProyecto {
    @NotBlank
    private String nombrePro;
    
    @NotBlank
    private String descripcionPro;
    
    //constructors

    public dtoProyecto() {
    }

    public dtoProyecto(String nombrePro, String descripcionPro) {
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
    }
    
    
}
