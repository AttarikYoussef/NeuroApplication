package pfe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class HistoriqueFormation {
	@Id @GeneratedValue
	Long id;
	@ManyToOne@JoinColumn
	Patient patient;
	@ManyToOne@JoinColumn
	Formation formation;
	@ManyToOne@JoinColumn
	Video lastVideo;
	@Value("false")
	Boolean etat;
}
