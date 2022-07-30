
package com.portfolio.aehwnd.Repository;

import com.portfolio.aehwnd.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyecto,Integer>{
    public Optional<Proyecto> findByNombrePro(String nombrePro);
    public boolean existsByNombrePro(String nombrePro);
    
}
