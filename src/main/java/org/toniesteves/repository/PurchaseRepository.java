package org.toniesteves.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.toniesteves.model.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, Long>{
	
	ResponseEntity<Purchase> findByClient(String client);

}
