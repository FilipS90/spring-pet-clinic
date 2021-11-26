package guru.springpetclinic.model.services;

import java.util.Set;

import guru.springpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner o);
	
	Set<Owner> findAll();
}
