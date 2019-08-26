
package com.bootcamp.Ujian.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table (name = "groups")
public class Group {

    @Id
    @Column (name = "id")
    @SerializedName("id")
    @Expose
    private int Id;
    @Column (name = "code")
    @SerializedName("code")
    @Expose
    private String Code;
    @SerializedName("name")
    @Expose
    @Column (name = "name")
    private String Name;
    @SerializedName("project_id")
    @Expose
    @Column (name = "projectid")
    private int ProjectId;
    @SerializedName("minimum_personnel")
    @Expose
    @Column (name = "minimumpersonnel")
    private int MinimumPersonnel;
    @SerializedName("description")
    @Expose
    @Column (name = "description")
    private String Description;
    @SerializedName("attendance_qr_code")
    @Expose
    @Column (name = "attendanceqrcode")
    private String AttendanceQrCode;
    @SerializedName("status")
    @Expose
    @Column (name = "status")
    private int Status;
    
    public Group() {
    	
    }

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

	public int getProjectId() {
		return ProjectId;
	}

	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}

	public int getMinimumPersonnel() {
		return MinimumPersonnel;
	}

	public void setMinimumPersonnel(int minimumPersonnel) {
		MinimumPersonnel = minimumPersonnel;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getAttendanceQrCode() {
		return AttendanceQrCode;
	}

	public void setAttendanceQrCode(String attendanceQrCode) {
		AttendanceQrCode = attendanceQrCode;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

}