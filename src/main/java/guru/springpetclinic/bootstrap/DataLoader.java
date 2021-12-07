package guru.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springpetclinic.model.Owner;
import guru.springpetclinic.model.Pet;
import guru.springpetclinic.model.PetType;
import guru.springpetclinic.model.Vet;
import guru.springpetclinic.model.services.MapService;
import guru.springpetclinic.model.services.OwnerService;
import guru.springpetclinic.model.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader() {
		this.ownerService = new OwnerService(new MapService<Owner, Long>());
		this.vetService = new VetService(new MapService<Vet, Long>());
	}

	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Filip");
		owner1.setLastName("Stojiljkovic");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner1.setId(2L);
		owner1.setFirstName("Mare");
		owner1.setLastName("Mitranovic");
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners..");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Bojana");
		vet1.setLastName("Glisic");
		vet1.setId(1L);
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet1.setFirstName("Dragana");
		vet1.setLastName("Matic");
		vet1.setId(2L);
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
		
	}
	
	
}
