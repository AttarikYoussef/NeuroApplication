package pfe.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors
@Entity
public class Module {
	@Id @GeneratedValue
	Long id;
	String nom;
	String description;
	@ManyToOne@JoinColumn
	Formation formation;
	@OneToMany(mappedBy = "module")
	List<SousModule>sousModules;
}
