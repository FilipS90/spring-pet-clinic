package guru.springpetclinic.model.services;

import guru.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String s);
}
