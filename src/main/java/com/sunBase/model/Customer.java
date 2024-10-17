package com.sunBase.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

	@Id
	private String uuid;
	@NotEmpty(message = "first name should not be Empty!")
	@JsonProperty("first_name")
	private String first_name;
	
	@NotEmpty(message = "Last name should not be Empty!")
	@JsonProperty("last_name")
	private String last_name;
	@NotEmpty(message = "street name should not be Empty!")
	private String street;
	
	@NotEmpty(message = "address should not be Empty!")
	private String address;
	
	@NotEmpty(message = "City should not be Empty!")
	private String city;
	
	@NotEmpty(message = "State should be not Empty and not null!")
	private String state;
	
	@Email(message = "please write proper email format")
	private String email;
	
	@NotEmpty(message = "phone number should not be Empty give proper valid phone number!")
	private String phone;
}


