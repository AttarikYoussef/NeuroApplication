package pfe.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors
@Entity
public class Question {
	@Id @GeneratedValue
	Long id;
	String description;
	@ManyToMany(mappedBy = "questions")
	List<Diagnostique>diagnostiques;
	@OneToMany(mappedBy = "question")
	List<Reponse>reponses;
}
