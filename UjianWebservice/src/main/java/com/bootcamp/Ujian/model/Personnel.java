
package com.bootcamp.Ujian.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "personnel")
public class Personnel {

	@Id
	@Column(name = "id")
	@SerializedName("id")
	@Expose
	private int id;
	@Column(name = "codes")
	@SerializedName("code")
	@Expose
	private String code;
	@Column(name = "user_id")
	@SerializedName("user_id")
	@Expose
	private int userId;
	@Column(name = "photo_url")
	@SerializedName("photo_url")
	@Expose
	private String photoUrl;
	@Column(name = "first_name")
	@SerializedName("first_name")
	@Expose
	private String firstName;
	@Column(name = "middle_name")
	@SerializedName("middle_name")
	@Expose
	private String middleName;
	@Column(name = "last_name")
	@SerializedName("last_name")
	@Expose
	private String lastName;
	@Column(name = "complete_name")
	@SerializedName("complete_name")
	@Expose
	private String completeName;
	@Column(name = "gender")
	@SerializedName("gender")
	@Expose
	private String gender;
	@Column(name = "height")
	@SerializedName("height")
	@Expose
	private String height;
	@Column(name = "weight")
	@SerializedName("weight")
	@Expose
	private String weight;
	@Column(name = "dob")
	@SerializedName("dob")
	@Expose
	private String dob;
	@Column(name = "pob")
	@SerializedName("pob")
	@Expose
	private String pob;
	@Column(name = "hp")
	@SerializedName("hp")
	@Expose
	private String hp;
	@Column(name = "address")
	@SerializedName("address")
	@Expose
	private String address;
	@Column(name = "firebase_token")
	@SerializedName("firebase_token")
	@Expose
	private String firebaseToken;
	@Column(name = "device_id")
	@SerializedName("device_id")
	@Expose
	private String deviceId;
	@Transient
	@SerializedName("position")
	@Expose
	private Position position;
	@Transient
	@SerializedName("group")
	@Expose
	private Group group;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompleteName() {
		return completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPob() {
		return pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirebaseToken() {
		return firebaseToken;
	}

	public void setFirebaseToken(String firebaseToken) {
		this.firebaseToken = firebaseToken;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Personnel() {

	}

}
