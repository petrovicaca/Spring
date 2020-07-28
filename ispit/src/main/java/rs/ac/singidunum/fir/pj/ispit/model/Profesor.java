package rs.ac.singidunum.fir.pj.ispit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "profesor")
public class Profesor {
	@Id
	@GeneratedValue
	@Column(name = "profesor_id")
	private int profesor_id;
	
	@Column(name = "ime")
	private String ime;
	
	@Column(name = "prezime")
	private String prezime; 
	
	@Column(name = "email")
	private String email;
	
	public Profesor() {}

	public Profesor(int profesor_id, String ime, String prezime, String email) {
		this.profesor_id = profesor_id;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
	}
	
	public Profesor(String ime, String prezime, String email) {
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getProfesor_id() {
		return profesor_id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public void setProfesor_id(int profesor_id) {
		this.profesor_id = profesor_id;
	}

	@Override
	public String toString() {
		return "Profesor [profesor_id=" + profesor_id + ", ime=" + ime + ", prezime=" + prezime + ", email=" + email
				+ "]";
	}
	
	
}
