package com.mgs.themelangeproject.dataobjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component
public class HomeDo {
	
	@Id
	private String file_name;
	
	@Column
	private String heading;
	
	@Column
	private String Descripition;
	
	
	@Transient
	private MultipartFile video_file;


	public String getFile_name() {
		return file_name;
	}


	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}


	public String getHeading() {
		return heading;
	}


	public void setHeading(String heading) {
		this.heading = heading;
	}


	public String getDescripition() {
		return Descripition;
	}


	public void setDescripition(String descripition) {
		Descripition = descripition;
	}


	public MultipartFile getVideo_file() {
		return video_file;
	}


	public void setVideo_file(MultipartFile video_file) {
		this.video_file = video_file;
	}
	
	

}
