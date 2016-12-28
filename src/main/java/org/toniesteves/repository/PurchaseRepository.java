package org.toniesteves.repository;

import org.springframework.data.repository.CrudRepository;
import org.toniesteves.model.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, Long>{

}
