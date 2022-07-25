
package com.portfolio.aehwnd.Controller;

import com.portfolio.aehwnd.Entity.Persona;
import com.portfolio.aehwnd.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.traerPersonas();
    }
    
    @GetMapping("personas/traer/perfil")
    public Persona traerPersona(){
        return ipersonaService.buscarPersona(1);
                
    }
    
    @PostMapping("/personas/crear")
    public void createPersona(@RequestBody Persona persona){
        ipersonaService.guardarPersona(persona);
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public void borrarPersona(@PathVariable Long id){
        ipersonaService.borrarPersona(id);
    }
    
    
    
    @PutMapping("/personas/editar/{id}")
    public Persona editarPersona(@PathVariable long id,
            @RequestParam("nombre") String nombreMod,
            @RequestParam("apellido") String apellidoMod,
            @RequestParam("img") String imgMod){
    
        Persona persona = ipersonaService.buscarPersona(id);
        persona.setNombre(nombreMod);
        persona.setApellido(apellidoMod);
        persona.setImg(imgMod);
                
        ipersonaService.guardarPersona(persona);
        return persona;
    }
    
    
}
