package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, Long>{

}
