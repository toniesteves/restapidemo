package com.example.model;

import java.util.Date;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
public @Data class Purchase {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String product;
	private String client;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date date;
	private String category;
	// @Transient
	// private Map<String,Object> log;
	
}
