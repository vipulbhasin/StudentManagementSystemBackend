package com.sms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class RoleEntity {

	@Id
	private Integer roleId;
	private String roleType;

}

