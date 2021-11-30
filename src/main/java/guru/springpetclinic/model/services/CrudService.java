package guru.springpetclinic.model.services;

import java.util.Set;

public interface CrudService <T, ID> {
	
	Set<T> findAll();
	
	T findById(ID id);
	
	void save(T e);
	
	void delete(T e);
	
	void deleteById(ID id);
}
