package guru.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springpetclinic.model.services.VetService;

@Controller
public class VetController {
	
	private final VetService service;
	
	public VetController(VetService service) {
		this.service = service;
	}

	@RequestMapping({"/vets", "/vets/index"})
	public String listVets(Model model) {
		
		model.addAttribute("vets", service.findAll());
		
		return "vets/index";
	}
}
