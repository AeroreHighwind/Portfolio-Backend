
package com.portfolio.aehwnd.Interface;

import com.portfolio.aehwnd.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(long id);
    
    public Persona findPersona(long id);
}
