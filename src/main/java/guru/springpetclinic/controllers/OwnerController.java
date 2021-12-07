package guru.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springpetclinic.model.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {
	
	private final OwnerService service;
	
	public OwnerController(OwnerService os) {
		this.service = os;
	}
	
	@RequestMapping({"/index", "/"})
	public String listVets(Model model) {
		
		model.addAttribute("owners", service.findAll());
		
		return "owners/index";
	}

}
