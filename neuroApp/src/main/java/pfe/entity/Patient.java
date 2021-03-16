package pfe.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@DiscriminatorValue("Patient")
public class Patient extends Compte{
	String telephone;
	String ville;
	String sexe;
	@OneToMany(mappedBy = "patient")
	List<HistoriqueFormation>historiqueFormations;
	@OneToMany(mappedBy = "patient")
	List<Historique>historiques;
}
