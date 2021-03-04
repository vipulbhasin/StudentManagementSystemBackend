package com.sms.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {

	@Id
	private Integer userId;
	private String username;
	private String password;
	private Date lastLogin;
	
	@OneToOne(cascade = CascadeType.ALL)
	private RoleEntity role;
	
	private Boolean isActive;
	
}
