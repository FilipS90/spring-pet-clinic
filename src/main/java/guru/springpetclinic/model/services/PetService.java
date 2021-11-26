package guru.springpetclinic.model.services;

import java.util.Set;

import guru.springpetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet p);
	
	Set<Pet> findAll();
}
