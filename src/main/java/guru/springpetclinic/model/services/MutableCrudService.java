package guru.springpetclinic.model.services;

import java.util.Set;

public abstract class MutableCrudService<T, ID> {
	
	protected abstract Set<T> findAll();
	
	protected abstract T findById(ID id);
	
	protected abstract void save(ID id, T element);
	
	protected abstract void deleteById(ID id);
	
	protected abstract void delete(T element);
}
