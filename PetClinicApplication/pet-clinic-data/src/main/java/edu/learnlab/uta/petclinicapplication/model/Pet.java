package edu.learnlab.uta.petclinicapplication.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
    private Owner owner;
    private PetType petType;
    private LocalDate bday;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public LocalDate getBday() {
        return bday;
    }

    public void setBday(LocalDate bday) {
        this.bday = bday;
    }
}
