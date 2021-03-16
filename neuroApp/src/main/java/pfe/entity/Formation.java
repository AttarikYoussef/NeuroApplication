package pfe.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors
@Entity
public class Formation {
	@Id @GeneratedValue
	Long id;
	String nom;
	String description;
	double prix;
	Date dateMES;
	@OneToMany(mappedBy = "formation")
	List<HistoriqueFormation>historiqueFormations;
	@OneToMany(mappedBy = "formation")
	List<Module>modules;
}
