package com.example.evaluacionTecnica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.evaluacionTecnica.dto.MovementDTO;
import com.example.evaluacionTecnica.models.Movement;

@Service
public interface MovementService {
	public List<Movement> getMovement();
	public Movement createMovement(MovementDTO movementDTO);
	/* public void emitNext1(String message); */
}
