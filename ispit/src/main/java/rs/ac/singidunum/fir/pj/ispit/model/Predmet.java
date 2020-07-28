package rs.ac.singidunum.fir.pj.ispit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "predmet")
public class Predmet {
	@Id
	@GeneratedValue
	@Column(name = "predmet_id")
	private int predmet_id;
	
	@Column(name = "naziv")
	private String naziv;
	
	@Column(name = "opis")
	private String opis;
	
	@Column(name = "profesor_id")
	private int profesor_id;
	
	public Predmet() {
		
	}

	public Predmet(int predmet_id, String naziv, String opis, int profesor_id) {
		this.predmet_id = predmet_id;
		this.naziv = naziv;
		this.opis = opis;
		this.profesor_id = profesor_id;
	}

	public Predmet(String naziv, String opis, int profesor_id) {
		this.naziv = naziv;
		this.opis = opis;
		this.profesor_id = profesor_id;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getOpis() {
		return opis;
	}

	public int getPredmet_id() {
		return predmet_id;
	}

	public int getProfesor_id() {
		return profesor_id;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public void setPredmet_id(int predmet_id) {
		this.predmet_id = predmet_id;
	}

	public void setProfesor_id(int profesor_id) {
		this.profesor_id = profesor_id;
	}

	@Override
	public String toString() {
		return "Predmet [predmet_id=" + predmet_id + ", naziv=" + naziv + ", opis=" + opis + ", profesor_id="
				+ profesor_id + "]";
	}
	
}
