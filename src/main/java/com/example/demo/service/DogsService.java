package com.example.demo.service;

import com.example.demo.model.Dog;
import com.example.demo.repositories.DogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class DogsService {

    @Autowired
    DogsRepository repository;

    public void add(Dog dto) {
        repository.save(toEntity(dto));
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

    public List<Dog> getDogs() {
        return (List<Dog>) repository.findAll();
    }

    public Dog getDogById(long id) {
        Optional<Dog> optionalDog = repository.findById(id);
        return null;
    }

    private Dog toEntity(Dog dto) {
        Dog entity = new Dog();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        return entity;
    }

}
