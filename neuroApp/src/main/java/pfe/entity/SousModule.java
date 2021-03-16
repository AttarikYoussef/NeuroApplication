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
public class SousModule {
	@Id @GeneratedValue
	Long id;
	String nom;
	String description;
	@ManyToOne@JoinColumn
	Module module;
	@ManyToMany
	List<Video>videos;
}
