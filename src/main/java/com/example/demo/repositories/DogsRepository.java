package com.example.demo.repositories;

import com.example.demo.model.Dog;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository

public interface DogsRepository extends CrudRepository<Dog, Long> {}
