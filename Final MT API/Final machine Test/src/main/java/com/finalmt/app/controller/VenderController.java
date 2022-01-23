package com.finalmt.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalmt.app.model.Vender;
import com.finalmt.app.service.IVenderService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class VenderController {
	
	@Autowired
	private IVenderService venderService;
	
	@GetMapping("/venders")
	public List<Vender> getAllVenders() {
		return (List<Vender>) venderService.getAllVenders();
	}

	@GetMapping("/venders/{venderId}")
	public Optional<Vender> getVenderByVenderId(Integer venderId) {
		return venderService.getVenderByVenderId(venderId);
	}

	@PostMapping("/venders")
	public void addVender(@RequestBody Vender vender) {
		venderService.addVender(vender);
	}

	@PutMapping("/venders")
	public void updateVender(@RequestBody Vender vender) {
		venderService.updateVender(vender);
	}

	@DeleteMapping("/venders/{venderId}")
	public void deleteVender(@PathVariable Integer venderId) {
		venderService.deleteVender(venderId);
	}
	
}
