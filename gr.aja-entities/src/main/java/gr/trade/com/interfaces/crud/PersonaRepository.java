package gr.trade.com.interfaces.crud;

import gr.trade.com.model.Persona;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("PersonaRepository")
public interface PersonaRepository extends CrudRepository<Persona, Long> {
			
	@Query("from Persona p where p.nombreusuario = :nombreusuario")
	Persona findByUserNamePassword (@Param("nombreusuario")String nombreusuario);
	
}
