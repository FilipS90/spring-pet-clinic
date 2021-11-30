package guru.springpetclinic.model.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import guru.springpetclinic.model.Vet;

public class VetService implements CrudService<Vet, Long> {
	
	private AbstractCrudService<Vet, Long> crudService;
	
	@Autowired
	public VetService(AbstractCrudService<Vet, Long> crudService) {
		this.crudService = crudService;
	}

	@Override
	public Set<Vet> findAll() {
		return crudService.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return crudService.findById(id);
	}

	@Override
	public void save(Vet e) {
		crudService.save(e.getId(), e);
		
	}

	@Override
	public void delete(Vet e) {
		crudService.delete(e);
	}

	@Override
	public void deleteById(Long id) {
		crudService.deleteById(id);
	}

}
