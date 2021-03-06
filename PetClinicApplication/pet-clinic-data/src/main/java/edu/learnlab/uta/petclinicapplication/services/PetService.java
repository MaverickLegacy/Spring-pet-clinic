package edu.learnlab.uta.petclinicapplication.services;

import edu.learnlab.uta.petclinicapplication.model.Owner;
import edu.learnlab.uta.petclinicapplication.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long>{
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
