package com.sms.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "admin_hod")
public class AdminHodEntity {

	private Integer adminId;
	private Date createdAt;
	private Date updatedAt;
	
	@OneToOne(cascade = CascadeType.ALL)
	private UserEntity user;
	
}
