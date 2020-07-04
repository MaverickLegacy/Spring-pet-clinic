package edu.learnlab.uta.petclinicapplication.services;

import edu.learnlab.uta.petclinicapplication.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
