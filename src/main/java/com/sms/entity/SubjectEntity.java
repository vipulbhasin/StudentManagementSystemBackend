package com.sms.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class SubjectEntity {

	@Id
	private Integer subjectId;
	private String subjectName;
	private Date createdAt;
	private Date updatedAt;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private CourseEntity courseId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private StaffEntity staffId;
	
}
