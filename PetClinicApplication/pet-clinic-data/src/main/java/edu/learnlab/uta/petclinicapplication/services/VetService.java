package edu.learnlab.uta.petclinicapplication.services;

import edu.learnlab.uta.petclinicapplication.model.Vet;
import java.util.Set;

public interface VetService extends CrudService<Vet, Long>{
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
