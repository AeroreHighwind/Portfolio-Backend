
package com.portfolio.aehwnd.Repository;


import com.portfolio.aehwnd.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByNombreEdu(String nombreE);
    public boolean existsByNombreEdu(String nombreE);
}
