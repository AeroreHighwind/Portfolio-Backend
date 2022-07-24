
package com.portfolio.aehwnd.Interface;

import com.portfolio.aehwnd.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> getPersona();
    
    public void guardarPersona(Persona persona);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);
}
