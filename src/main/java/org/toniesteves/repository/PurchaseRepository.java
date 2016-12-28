package org.toniesteves.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.toniesteves.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long>{
	
	List<Purchase> findByClientOrProductOrCategory(String client, String product, String category);
	


	
}
