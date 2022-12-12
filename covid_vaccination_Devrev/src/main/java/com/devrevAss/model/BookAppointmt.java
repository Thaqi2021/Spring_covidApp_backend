package com.devrevAss.model;


import javax.validation.constraints.NotEmpty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
public class BookAppointmt {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private long pat_idb;
	private int center_idb;
	private long mob_nmb;
	
	@NotEmpty
	private String date;
	
	private String vac;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPat_idb() {
		return pat_idb;
	}

	public void setPat_idb(long pat_idb) {
		this.pat_idb = pat_idb;
	}

	public int getCenter_idb() {
		return center_idb;
	}

	public void setCenter_idb(int center_idb) {
		this.center_idb = center_idb;
	}

	public long getMob_nmb() {
		return mob_nmb;
	}

	public void setMob_nmb(long mob_nmb) {
		this.mob_nmb = mob_nmb;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVac() {
		return vac;
	}

	public void setVac(String vac) {
		this.vac = vac;
	}
	
	
}
