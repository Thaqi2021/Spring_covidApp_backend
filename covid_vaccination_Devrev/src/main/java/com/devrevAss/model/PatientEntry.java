package com.devrevAss.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
public class PatientEntry {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pat_id;
	
	private String name;
	
	private long mob_num;
	
	private String aadhar_num;
	
	private String email;
	
	private String password;
	private int status;
	private int dose_cnt;
	private String address;
	private String city;
	private String state;
	private String country;
	private int pincode;
	
	public long getPat_id() {
		return pat_id;
	}
	public void setPat_id(long pat_id) {
		this.pat_id = pat_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMob_num() {
		return mob_num;
	}
	public void setMob_num(long mob_num) {
		this.mob_num = mob_num;
	}
	public String getAadhar_num() {
		return aadhar_num;
	}
	public void setAadhar_num(String aadhar_num) {
		this.aadhar_num = aadhar_num;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDose_cnt() {
		return dose_cnt;
	}
	public void setDose_cnt(int dose_cnt) {
		this.dose_cnt = dose_cnt;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
