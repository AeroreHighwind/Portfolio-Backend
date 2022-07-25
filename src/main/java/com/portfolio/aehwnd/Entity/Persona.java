
package com.portfolio.aehwnd.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 31, message = "El nombre ingresado no cumple con la longitud requerida (1 caracter"
            + "min, 31 max.)")
    
    private String nombre;
    @NotNull
    @Size(min = 1, max = 31, message = "El apellido ingresado no cumple con la longitud requerida (1 caracter"
            + "min, 31 max.)")
    private String apellido;
    
   
    @Size(min = 1, max = 50, message = "El nombre ingresado no cumple con la longitud requerida (1 caracter"
            + "min, 31 max.)")
    private String img;
    
    @Size(min = 0, max = 1000, message = "La descripcion no cumple con la longitud requerida (1000 caracteres max)")
    private String about;
    
}
