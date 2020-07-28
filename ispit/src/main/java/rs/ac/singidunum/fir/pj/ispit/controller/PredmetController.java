package rs.ac.singidunum.fir.pj.ispit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.singidunum.fir.pj.ispit.model.Predmet;
import rs.ac.singidunum.fir.pj.ispit.model.Profesor;
import rs.ac.singidunum.fir.pj.ispit.repository.PredmetRepository;

@RestController
public class PredmetController {
	
	@Autowired
	private PredmetRepository predmetRepository;
	
	@GetMapping("/predmeti")
	public List<Predmet> getAll() {
		return predmetRepository.findAll();
	}
	
	@GetMapping("/predmeti/{id}")
	public Predmet showProfesor(@PathVariable int id) {
		return predmetRepository.findById(id).orElse(null);
	}
	
	@PostMapping("/predmeti")
	public Predmet create(@RequestBody Predmet predmet) {
		return predmetRepository.save(predmet);
	}
	
	@DeleteMapping("/predmeti/{id}")
	public boolean delete(@PathVariable String id) {
		int predmetId = Integer.parseInt(id);
		predmetRepository.deleteById(predmetId);
		return true;
	}
	
	@PutMapping("/predmeti/{id}")
	public Predmet update(@PathVariable int id, @RequestBody Predmet p) {
		Predmet predmet = predmetRepository.findById(id).orElse(null);
		predmet.setNaziv(p.getNaziv());
		predmet.setOpis(p.getOpis());
		predmet.setProfesor_id(p.getProfesor_id());
		
		return predmetRepository.save(predmet);
	}
	
}
