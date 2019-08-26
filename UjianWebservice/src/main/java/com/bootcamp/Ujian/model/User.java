
package com.bootcamp.Ujian.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "user")
public class User {
	@Id
	@Column(name = "id")
	@SerializedName("id")
	@Expose
	private int id;
	@Column(name = "username")
	@SerializedName("username")
	@Expose
	private String username;
	@Column(name = "email")
	@SerializedName("email")
	@Expose
	private String email;
	@OneToOne
	@SerializedName("personnel")
	@Expose
	private Personnel personnel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Personnel getPersonnel() {
		return personnel;
	}

	public void setPersonnel(Personnel personnel) {
		this.personnel = personnel;
	}

	public User() {

	}
}