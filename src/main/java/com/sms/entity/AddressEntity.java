package com.sms.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sms.model.AddressType;

@Entity
@Table(name = "address")
public class AddressEntity {

	@Id
	private Integer addressId;
	private String city;
	private String state;
	private String country;
	private Integer pincode;
	private String addLine1;
	private String addLine2;
	
	@Enumerated(EnumType.STRING)
	private AddressType addressType;
//	private String latitude;
//	private String longitude;
	
}
