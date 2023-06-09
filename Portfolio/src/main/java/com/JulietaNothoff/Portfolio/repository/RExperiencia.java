
package com.JulietaNothoff.Portfolio.repository;

import com.JulietaNothoff.Portfolio.entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author julie
 */
@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer>{
    
    public Optional<Experiencia> findByNombreE(String nombreE);
    
    public boolean existsByNombreE(String nombreE);   
    
}
