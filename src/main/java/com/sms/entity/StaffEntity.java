package com.sms.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class StaffEntity {

	@Id
	private Integer staffId;
	private String firstName;
	private String lastName;
	private Date dob;
	private String gender;
	private String profilePic;
	private String email;
	private Integer phoneNo;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<AddressEntity> address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private UserEntity user;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Integer courseId;
	
	private Date createdAt;
	private Date updatedAt;
}
