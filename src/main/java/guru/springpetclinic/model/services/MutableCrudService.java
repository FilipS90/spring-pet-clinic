package guru.springpetclinic.model.services;

import java.util.Set;

public abstract class MutableCrudService<T> {
	
	protected abstract Set<T> findAll();
	
	protected abstract T findById(Long id);
	
	protected abstract void save(T element);
	
	protected abstract void deleteById(Long id);
	
	protected abstract void delete(T element);
}
