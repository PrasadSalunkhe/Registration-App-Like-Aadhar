package com.ssnapp.entity;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name = "citizen_ssn_data")
public class CitizenDataEntity {
	@Id
	@GenericGenerator(name = "ssn_generator", strategy = "com.ssnapp.generator.AutoSSNGenerator")
	@GeneratedValue(generator = "ssn_generator" )
	@Column(name="ssn_no")
	private Long ssnId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="gender")
	private Character gender;
	@Column(name="state")
	private String state;
	@Temporal(TemporalType.DATE)
	@Column(name="dob")
	private Date dob;
	@Column(name="Photo")
	private Blob photo;

}
