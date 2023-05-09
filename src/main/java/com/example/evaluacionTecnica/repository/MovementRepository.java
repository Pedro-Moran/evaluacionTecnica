package com.example.evaluacionTecnica.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.evaluacionTecnica.models.Movement;

@Repository
public interface MovementRepository extends MongoRepository<Movement, String>{

}
