package com.example.evaluacionTecnica.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.evaluacionTecnica.dto.MovementDTO;
import com.example.evaluacionTecnica.models.Movement;
import com.example.evaluacionTecnica.repository.MovementRepository;
import com.example.evaluacionTecnica.service.MovementService;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;


import reactor.core.publisher.Sinks;

@Service
public class MovementServiceImpl implements MovementService {

	/*
	 * private final Sinks.Many<Message<Object>> many =
	 * Sinks.many().unicast().onBackpressureBuffer();
	 */

	@Autowired
	private MovementRepository movementRepository;

	@Override
	public List<Movement> getMovement() {
		return movementRepository.findAll();
	}

	@Override
	public Movement createMovement(MovementDTO movementDTO) {
		Movement movement = new Movement(movementDTO);
		return movementRepository.save(movement);
	}

	/*
	 * public void emitNext1(String message) { many.emitNext(new
	 * GenericMessage<>(message), Sinks.EmitFailureHandler.FAIL_FAST); }
	 */

}
