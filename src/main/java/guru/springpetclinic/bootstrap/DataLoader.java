package guru.springpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springpetclinic.model.Owner;
import guru.springpetclinic.model.Vet;
import guru.springpetclinic.model.services.OwnerService;
import guru.springpetclinic.model.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	@Autowired
	public DataLoader(OwnerService os, VetService vs) {
		this.ownerService = os;
		this.vetService = vs;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Filip");
		owner1.setLastName("Stojiljkovic");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Mare");
		owner2.setLastName("Mitranovic");
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners..");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Bojana");
		vet1.setLastName("Glisic");
		vet1.setId(1L);
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Dragana");
		vet2.setLastName("Matic");
		vet2.setId(2L);
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
		
	}
	
	
}
