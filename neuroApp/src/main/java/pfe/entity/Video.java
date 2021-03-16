package pfe.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors
@Entity
public class Video {
	@Id @GeneratedValue
	Long id;
	String description;
	String chemin;
	@ManyToMany(mappedBy = "videos")
	List<SousModule>sousModules;
}
