package gr.trade.com.interfaces.crud;

import gr.trade.com.model.Worker;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("WorkerRepository")
public interface WorkerRepository extends CrudRepository<Worker, Long> {

	@Query("select w from Worker w where w.name = :name")
	Worker findByName(String name);
	
	@Query("select w from Worker w where w.company.id = :idCompany")
	Worker findByIdCompany(Long idCompany);
	
}
