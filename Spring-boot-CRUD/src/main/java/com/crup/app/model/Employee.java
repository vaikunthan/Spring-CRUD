package com.crup.app.model;
import jakarta.persistence.Column;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@jakarta.persistence.Entity
@Table(name="employees")
public class Employee {
	@Id
   
	private long id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column  (name="email")
	private String email;

}
