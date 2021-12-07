package guru.springpetclinic.model.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springpetclinic.model.Owner;

@Service
public class OwnerService implements CrudService<Owner, Long> {
	
	private MutableCrudService<Owner, Long> crudService;
	
	@Autowired
	public OwnerService(MutableCrudService<Owner, Long> crudService) {
		this.crudService = crudService;
	}

	@Override
	public Set<Owner> findAll() {
		return crudService.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return crudService.findById(id);
	}

	@Override
	public void save(Owner e) {
		crudService.save(e.getId(), e);
	}

	@Override
	public void delete(Owner e) {
		crudService.delete(e);
	}

	@Override
	public void deleteById(Long id) {
		crudService.deleteById(id);
	}

}
