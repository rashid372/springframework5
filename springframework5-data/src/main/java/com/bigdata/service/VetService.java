package com.bigdata.service;

import com.bigdata.model.Owner;
import com.bigdata.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
