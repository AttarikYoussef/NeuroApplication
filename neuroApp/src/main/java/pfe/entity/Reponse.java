package pfe.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors
@Entity
public class Reponse {
	@Id @GeneratedValue
	Long id;
	String description;
	@ManyToOne@JoinColumn
	Question question;
	@ManyToMany
	List<Historique>historiques;
}
