package br.com.neurotech.spring.data.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.neurotech.spring.data.models.Clinic;
import br.com.neurotech.spring.data.repository.ClinicRepository;

@RestController
@RequestMapping(value="/api")
public class ClinicResource {
		
	@Autowired
	ClinicRepository clinicRepository;
	
	@GetMapping("/clinics")
	public List<Clinic> listClinics() {
		return clinicRepository.findAll();
	}
	
	@GetMapping("/clinic/{id}")
	public Optional<Clinic> listOneClinic(@PathVariable(value="id") Integer id) {
		return clinicRepository.findById(id);
	}
		
	@PostMapping("/clinic")
	public Clinic saveClinic(@RequestBody Clinic clinic) {
		return clinicRepository.save(clinic);
	}
	

	
	@DeleteMapping("/clinic")
	public void deleteClinic(@RequestBody Clinic clinic) {
		clinicRepository.delete(clinic);
	}
	
	@PutMapping("/clinic")
	public Clinic updateClinic(@RequestBody Clinic clinic) {
		return clinicRepository.save(clinic);
		
	}

}
