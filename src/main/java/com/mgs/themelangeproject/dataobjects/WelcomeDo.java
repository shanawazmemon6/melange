package com.mgs.themelangeproject.dataobjects;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="welcome")
@Component
public class WelcomeDo {
	
	@Id
	private String file_name;
	
	@Column
	private String heading;
	
	@Column
	private String Descripition;
	
	@Column
	private String inst_url;
	

	@Column
	private String fb_url;

	@Column
	private String youtube_url;

	@Column
	private String vimeo_url;
	
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


	public String getInst_url() {
		return inst_url;
	}


	public void setInst_url(String inst_url) {
		this.inst_url = inst_url;
	}


	public String getFb_url() {
		return fb_url;
	}


	public void setFb_url(String fb_url) {
		this.fb_url = fb_url;
	}


	public String getYoutube_url() {
		return youtube_url;
	}


	public void setYoutube_url(String youtube_url) {
		this.youtube_url = youtube_url;
	}


	public String getVimeo_url() {
		return vimeo_url;
	}


	public void setVimeo_url(String vimeo_url) {
		this.vimeo_url = vimeo_url;
	}
	
	

}
