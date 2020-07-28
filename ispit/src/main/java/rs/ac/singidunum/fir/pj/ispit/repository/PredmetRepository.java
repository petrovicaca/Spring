package rs.ac.singidunum.fir.pj.ispit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.ac.singidunum.fir.pj.ispit.model.Predmet;
import rs.ac.singidunum.fir.pj.ispit.model.Profesor;

@Repository
public interface PredmetRepository extends JpaRepository<Predmet, Integer> {
	
}
