package com.example.evaluacionTecnica.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.evaluacionTecnica.dto.MovementDTO;
import com.example.evaluacionTecnica.models.Movement;
import com.example.evaluacionTecnica.service.MovementService;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/movements")
@Slf4j
public class MovementController {
	
	@Autowired
	private MovementService movementService;

	/*
	 * @GetMapping("/read") public ResponseEntity<?> ReadJson(@RequestParam("file")
	 * MultipartFile file) { try {
	 * 
	 * ObjectMapper objectMapper = new ObjectMapper(); Object json =
	 * objectMapper.readValue(file.getInputStream(), Object.class); String jsonData
	 * = objectMapper.writeValueAsString(json); movementService.emitNext1(jsonData);
	 * 
	 * Map<String,Object> response = new HashMap<>(); response.put("message",
	 * "Archivo cargado"); return
	 * ResponseEntity.status(HttpStatus.OK).body(jsonData);
	 * 
	 * } catch (Exception e) { log.error(e.getMessage()); return
	 * ResponseEntity.internalServerError().build();
	 * 
	 * } }
	 */
	
	@GetMapping("")
	public ResponseEntity<List<Movement>> getAllMovement() {
		try {
			List<Movement> movement = movementService.getMovement();
			return ResponseEntity.status(HttpStatus.OK).body(movement);
			
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}
	}
	
	@PostMapping("")
	public ResponseEntity<Movement> createMovement(@RequestBody MovementDTO movementDTO){
		try {
			Movement movement = movementService.createMovement(movementDTO);
			return ResponseEntity.status(HttpStatus.CREATED).body(movement);
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}
		
	}

}
