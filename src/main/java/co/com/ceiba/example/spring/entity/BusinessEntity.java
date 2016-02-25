package co.com.ceiba.example.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BUSINESS")
public class BusinessEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID", nullable = false)
	private int id;
	
	@Column(name="RIF", nullable = false)
	private String rif;
	
	@Column(name="NAME", nullable = false)
	private String name;
	
	public void setName(String name) {
		this.name = name;
		
	}

	public void setRif(String rif) {
		this.rif = rif;
		
	}

	public int getId() {
		return id;
	}

	public String getRif() {
		return rif;
	}

	public String getName() {
		return name;
	}
}
