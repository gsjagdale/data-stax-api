package com.shri.framework.spring.db.data.stax.into;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	private Integer id;

	private String username;
	private String fname;
	private String mname;
	private String lname;
	private String password;

}
