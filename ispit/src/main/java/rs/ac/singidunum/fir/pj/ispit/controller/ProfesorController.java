package rs.ac.singidunum.fir.pj.ispit.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javassist.NotFoundException;
import rs.ac.singidunum.fir.pj.ispit.model.Profesor;
import rs.ac.singidunum.fir.pj.ispit.repository.ProfesorRepository;

@RestController
public class ProfesorController {

	@Autowired
	private ProfesorRepository profesorRepository;
	
	@GetMapping("/profesori")
	public List<Profesor> getAll() {
		return profesorRepository.findAll();
	}
	
	@GetMapping("/profesori/{id}")
	public Profesor showProfesor(@PathVariable int id) {
		return profesorRepository.findById(id).orElse(null);
	}
	
	@PostMapping("/profesori")
	public Profesor create(@RequestBody Profesor profesor) {
		return profesorRepository.save(profesor);
	}
	
	@DeleteMapping("/profesori/{id}")
	public boolean delete(@PathVariable String id) {
		int profesorId = Integer.parseInt(id);
		profesorRepository.deleteById(profesorId);
		return true;
	}
	
	@PutMapping("/profesori/{id}")
	public Profesor update(@PathVariable int id, @RequestBody Profesor p) {
		Profesor profesor = profesorRepository.findById(id).orElse(null);
		profesor.setIme(p.getIme());
		profesor.setPrezime(p.getPrezime());
		profesor.setEmail(p.getEmail());
		
		return profesorRepository.save(profesor);
	}
}
