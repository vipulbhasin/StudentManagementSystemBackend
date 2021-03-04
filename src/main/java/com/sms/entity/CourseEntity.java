package com.sms.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class CourseEntity {

	@Id
	private Integer courseId;
	private String courseName;
	private Date createdAt;
	private Date updatedAt;
	
}
