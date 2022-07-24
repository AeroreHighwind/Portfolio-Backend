
package com.portfolio.aehwnd.Service;

import com.portfolio.aehwnd.Entity.Persona;
import com.portfolio.aehwnd.Interface.IPersonaService;
import com.portfolio.aehwnd.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
       return ipersonaRepository.findAll();
    }

    @Override
    public void guardarPersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
         ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
       return ipersonaRepository.findById(id).orElse(null);
    }
    
}
