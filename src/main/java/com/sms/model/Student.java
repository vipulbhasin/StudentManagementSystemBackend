package com.sms.model;

import java.util.Date;
import java.util.List;

public class Student {

	private Integer studentId;
	private String firstName;
	private String lastName;
	private Date dob;
	private String gender;
	private String profilePic;
	private String email;
	private Integer phoneNo;
	
	private List<Address> address;
	
	private Integer user;
	
	private Integer courseId;
	
	private Date createdAt;
	private Date updatedAt;
	
}
