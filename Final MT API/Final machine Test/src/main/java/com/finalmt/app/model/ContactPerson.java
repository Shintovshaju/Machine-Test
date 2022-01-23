package com.finalmt.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class ContactPerson {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int personId;
	private String personrName;
	private int venderId;
	private String department;
	private String email;
	private String phoneNu;
	private String location;
	private String isDeleted;
	
	@ManyToOne
	@JoinColumn(name="venderId", insertable = false,updatable = false)
	private Vender vender;
	

	public ContactPerson() {
		super();
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonrName() {
		return personrName;
	}

	public void setPersonrName(String personrName) {
		this.personrName = personrName;
	}

	public int getVenderId() {
		return venderId;
	}

	public void setVenderId(int venderId) {
		this.venderId = venderId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNu() {
		return phoneNu;
	}

	public void setPhoneNu(String phoneNu) {
		this.phoneNu = phoneNu;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	@JsonBackReference
	public Vender getVender() {
		return vender;
	}

	public void setVender(Vender vender) {
		this.vender = vender;
	}

	public ContactPerson(int personId, String personrName, int venderId, String department, String email,
			String phoneNu, String location, String isDeleted, Vender vender) {
		super();
		this.personId = personId;
		this.personrName = personrName;
		this.venderId = venderId;
		this.department = department;
		this.email = email;
		this.phoneNu = phoneNu;
		this.location = location;
		this.isDeleted = isDeleted;
		this.vender = vender;
	}

	@Override
	public String toString() {
		return "ContactPerson [personId=" + personId + ", personrName=" + personrName + ", venderId=" + venderId
				+ ", department=" + department + ", email=" + email + ", phoneNu=" + phoneNu + ", location=" + location
				+ ", isDeleted=" + isDeleted + ", vender=" + vender + "]";
	}
	
	
}
