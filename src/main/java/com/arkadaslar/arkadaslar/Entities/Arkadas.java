package com.arkadaslar.arkadaslar.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="arkadas")
public class Arkadas {
	@Id
	@Column(name="idarkadas")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idarkadas;
	
	@Column(name="arkadasisim")
	private String arkadasisim;
	
	@Column(name="arkadassoyisim")
	private String arkadassoyisim;

	
	public Arkadas() {
		
	}
	public Arkadas(int idarkadas, String arkadasisim, String arkadassoyisim) {
		super();
		this.idarkadas = idarkadas;
		this.arkadasisim = arkadasisim;
		this.arkadassoyisim = arkadassoyisim;
	}

	public int getIdarkadas() {
		return idarkadas;
	}

	public void setIdarkadas(int idarkadas) {
		this.idarkadas = idarkadas;
	}

	public String getArkadasisim() {
		return arkadasisim;
	}

	public void setArkadasisim(String arkadasisim) {
		this.arkadasisim = arkadasisim;
	}

	public String getArkadassoyisim() {
		return arkadassoyisim;
	}

	public void setArkadassoyisim(String arkadassoyisim) {
		this.arkadassoyisim = arkadassoyisim;
	}

}
