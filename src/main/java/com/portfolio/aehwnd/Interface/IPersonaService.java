
package com.portfolio.aehwnd.Interface;

import com.portfolio.aehwnd.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> traerPersonas();
    
    public void guardarPersona(Persona persona);
    
    public void borrarPersona(long id);
    
    public Persona buscarPersona(long id);
}
