package com.bigdata.service;

import com.bigdata.model.Owner;
import com.bigdata.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
