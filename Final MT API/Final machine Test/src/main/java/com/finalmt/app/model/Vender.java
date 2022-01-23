package com.finalmt.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Vender {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vendorId;
	private String venderName;
	private int productId;
	private String productName;
	private String address;
	private String location;
	private int pincode;
	
	@OneToMany(mappedBy = "vender",cascade = CascadeType.ALL)
	private List<ContactPerson> contact;
	
	
	public Vender() {
		super();
	}


	public int getVendorId() {
		return vendorId;
	}


	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}


	public String getVenderName() {
		return venderName;
	}


	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@JsonManagedReference
	public List<ContactPerson> getContact() {
		return contact;
	}


	public void setContact(List<ContactPerson> contact) {
		this.contact = contact;
	}


	public Vender(int vendorId, String venderName, int productId, String productName, String address, String location,
			int pincode, List<ContactPerson> contact) {
		super();
		this.vendorId = vendorId;
		this.venderName = venderName;
		this.productId = productId;
		this.productName = productName;
		this.address = address;
		this.location = location;
		this.pincode = pincode;
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "Vender [vendorId=" + vendorId + ", venderName=" + venderName + ", productId=" + productId
				+ ", productName=" + productName + ", address=" + address + ", location=" + location + ", pincode="
				+ pincode + ", contact=" + contact + "]";
	}	
	
}
