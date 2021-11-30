package guru.springpetclinic.model.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import guru.springpetclinic.model.Pet;

public class PetService implements CrudService<Pet, Long> {
	
	private AbstractCrudService<Pet, Long> crudService;
	
	@Autowired
	public PetService(AbstractCrudService<Pet, Long> crudService) {
		this.crudService = crudService;
	}

	@Override
	public Set<Pet> findAll() {
		return crudService.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return crudService.findById(id);
	}

	@Override
	public void save(Pet e) {
		crudService.save(e.getId(), e);
		
	}

	@Override
	public void delete(Pet e) {
		crudService.delete(e);
	}

	@Override
	public void deleteById(Long id) {
		crudService.deleteById(id);
	}

}
