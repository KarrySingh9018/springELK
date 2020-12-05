/**
* @author Ramanpreet Singh
*/
package com.crm.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Main POJO that gets stored in the table */
@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	//Default Constructor
	public Customer() {
		
	}
	
	/**
	* @return id
	*/
	public int getId() {
		return id;
	}
	/**
	* @param id to set the id
	*/
	public void setId(int id) {
		this.id = id;
	}
	/**
	* @return firstName
	*/
	public String getFirstName() {
		return firstName;
	}
	/**
	* @param firstName to set the firstName
	*/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	* @return lastName
	*/
	public String getLastName() {
		return lastName;
	}
	/**
	* @param lastName to set the lastName
	*/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	* @return email
	*/
	public String getEmail() {
		return email;
	}
	/**
	* @param email to set the email
	*/
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
		
}





