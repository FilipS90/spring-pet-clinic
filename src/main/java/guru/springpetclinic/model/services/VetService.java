package guru.springpetclinic.model.services;

import java.util.Set;

import guru.springpetclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet p);
	
	Set<Vet> findAll();
}
