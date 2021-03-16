package pfe.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors
@Entity
@DiscriminatorValue("Admin")
public class Admin extends Compte{
	
}
