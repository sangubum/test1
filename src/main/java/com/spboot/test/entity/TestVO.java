package com.spboot.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Entity
@Data
@Table(name="TestVO")
public class TestVO {
	
	@Id
	@Column(name="tv_title")
	private String tvTitle;
	@Column(name="tv_name")
	private String tvName;
	@Transient
	private MultipartFile tvfile;
}
