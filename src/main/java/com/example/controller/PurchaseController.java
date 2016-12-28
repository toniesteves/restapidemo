package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Purchase;
import com.example.repository.PurchaseRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/purchases")
public class PurchaseController {

	@Autowired
	private PurchaseRepository repository;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Purchase>> get() {
		List<Purchase> purchases = (List<Purchase>) repository.findAll();
		if (purchases.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(purchases);
		}
		return ResponseEntity.status(HttpStatus.OK).body(purchases);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<Purchase> findById(@PathVariable("id") Long id) {
		
		Purchase purchase = repository.findOne(id);
		
		return new ResponseEntity<Purchase>(purchase, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Purchase> create(@RequestBody @Valid Purchase purchase) {

		repository.save(purchase);

		return ResponseEntity.status(HttpStatus.CREATED).body(purchase);

	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Purchase> delete(@PathVariable("id") Long id) {
		repository.delete(id);
		return ResponseEntity.status(HttpStatus.OK).body(null);

	}

	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public ResponseEntity<Purchase> update(@PathVariable("id") Long id, @RequestBody @Valid Purchase chosen) {
		Purchase purchase = repository.findOne(id);
		purchase = chosen;
		repository.save(purchase);

		return ResponseEntity.status(HttpStatus.OK).body(purchase);


	}

}