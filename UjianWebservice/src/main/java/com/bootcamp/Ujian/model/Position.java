
package com.bootcamp.Ujian.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "Position")
public class Position {

	@Id
	@Column(name = "id")
	@SerializedName("id")
	@Expose
	private int Id;
	@SerializedName("code")
	@Expose
	@Column(name = "code")
	private String Code;
	@SerializedName("name")
	@Expose
	@Column(name = "name")
	private String Name;
	@SerializedName("description")
	@Expose
	@Column(name = "description")
	private String Description;
	@SerializedName("status")
	@Expose
	@Column(name = "status")
	private int Status;
	@SerializedName("created_by_user_id")
	@Expose
	@Column(name = "createdbyuserid")
	private int CreatedByUserId;
	@SerializedName("created_at")
	@Expose
	@Column(name = "createdat")
	private String CreatedAt;
	@SerializedName("updated_by_user_id")
	@Expose
	@Column(name = "updatebyuserid")
	private String UpdatedByUserId;
	@SerializedName("updated_at")
	@Expose
	@Column(name = "updatedat")
	private String UpdatedAt;
	@SerializedName("deleted_by_user_id")
	@Expose
	@Column(name = "deletedbyuserid")
	private String DeletedByUserId;
	public String getUpdatedByUserId() {
		return UpdatedByUserId;
	}

	public void setUpdatedByUserId(String updatedByUserId) {
		UpdatedByUserId = updatedByUserId;
	}

	public String getUpdatedAt() {
		return UpdatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		UpdatedAt = updatedAt;
	}

	public String getDeletedByUserId() {
		return DeletedByUserId;
	}

	public void setDeletedByUserId(String deletedByUserId) {
		DeletedByUserId = deletedByUserId;
	}

	@Column(name = "deleted_by_user")
	@SerializedName("deleted_by_user")
	@Expose
	private String deletedByUser;
	public String getDeletedByUser() {
		return deletedByUser;
	}

	public void setDeletedByUser(String deletedByUser) {
		this.deletedByUser = deletedByUser;
	}

//	@SerializedName("deleted_at")
//	@Expose
//	@Column(name = "deletedat")
//	private Object DeletedAt;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public int getCreatedByUserId() {
		return CreatedByUserId;
	}

	public void setCreatedByUserId(int createdByUserId) {
		CreatedByUserId = createdByUserId;
	}

	public String getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(String createdAt) {
		CreatedAt = createdAt;
	}

//	public Object getUpdatedByUserId() {
//		return UpdatedByUserId;
//	}
//
//	public void setUpdatedByUserId(Object updatedByUserId) {
//		UpdatedByUserId = updatedByUserId;
//	}

//	public Object getUpdatedAt() {
//		return UpdatedAt;
//	}
//
//	public void setUpdatedAt(Object updatedAt) {
//		UpdatedAt = updatedAt;
//	}
//
//	public Object getDeletedByUserId() {
//		return DeletedByUserId;
//	}
//
//	public void setDeletedByUserId(Object deletedByUserId) {
//		DeletedByUserId = deletedByUserId;
//	}
//
//	public Object getDeletedAt() {
//		return DeletedAt;
//	}

//	public void setDeletedAt(Object deletedAt) {
//		DeletedAt = deletedAt;
//	}

	public Position() {

	}
}