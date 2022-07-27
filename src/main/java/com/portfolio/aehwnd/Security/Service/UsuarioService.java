
package com.portfolio.aehwnd.Security.Service;

import com.portfolio.aehwnd.Security.Entity.Usuario;
import com.portfolio.aehwnd.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iUsuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iUsuarioRepository.existByNombreUsuario(nombreUsuario);
    }
    
        public boolean existsByEmail(String email){
        return iUsuarioRepository.existByEmail(email);
    }
    
        public void save(Usuario usuario){
            iUsuarioRepository.save(usuario);
        }
}
