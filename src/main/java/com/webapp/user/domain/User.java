package com.webapp.user.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="USERS")
public class User implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -608927139178566875L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(columnDefinition = "uuid DEFAULT uuid_generate_v4()")
	private UUID uuid = UUID.randomUUID();
	
	@Column(name="USERNAME", nullable=false)
	private String username;
	
	@Column(name="PASSWORD", nullable=false)
	private String password;
	
	@Column(name="FIRSTNAME", nullable=false)
	private String firstName;
	
	@Column(name="LASTNAME", nullable=false)
	private String lastName;
	
	@Column(name="AGE", nullable=false)
	private int age;
	
	@Column(name="ADDRESS", nullable=false)
	private String address;
	
	@Column(name="IS_SELLER", nullable=false)
	private boolean isSeller;
	
	@Column(name="IS_ACTIVE", nullable=false)
	private boolean isActive = true;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isSeller() {
		return isSeller;
	}

	public void setSeller(boolean isSeller) {
		this.isSeller = isSeller;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
