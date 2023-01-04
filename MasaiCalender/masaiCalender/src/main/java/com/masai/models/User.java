package com.masai.models;



import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer userId;
	
	@NotEmpty
	@Size(min = 3, message = "User Name should contain 3 or more than 3 latters !!")
	private String Firstname;
	
	@NotEmpty
	@Size(min = 3, message = "User Name should contain 3 or more than 3 latters !!")
	private String lastname;
	
	private LocalDateTime DateOfBirth;
	
	@NotEmpty
	@Size(min = 10, max = 10, message = "mobile No.  must be exact 10 digit !!")
	@Digits(fraction = 0, integer = 10, message = "mobile No. should contains the number only !!")
	private String mobileNo;
	
	@NotEmpty
	@Size(min = 4, max=10, message = "User password should contains the minimum 4 and maximum 10 chars !!")
	private String password;
	
	@NotEmpty
	@Email
	@Pattern(regexp ="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "Please Enter valid Email Id included @ and proper Name !!" )
	private String email;

	

}