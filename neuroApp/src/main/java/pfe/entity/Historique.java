package pfe.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Historique {
	@Id @GeneratedValue
	Long id;
	@ManyToOne@JoinColumn
	Patient patient;
	@ManyToOne@JoinColumn
	Diagnostique diagnostique;
	@Temporal(TemporalType.DATE)
	Date dateHistorique;
	@Temporal(TemporalType.TIME)
	Date heureHistorique;
	@ManyToMany(mappedBy = "historiques")
	List<Reponse>reponses;
}
