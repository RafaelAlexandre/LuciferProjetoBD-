package br.edu.unifei.ecot12.lucifer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Inferno implements Serializable{
	
	
	private static final long serialVersionUID = 2274708775701151067L;
	
	@Id
	@GeneratedValue
	private Integer codigo;
	
	@OneToMany 
	@ElementCollection(targetClass = Humano.class)
	List <Humano> condenados = new ArrayList<>();
}
