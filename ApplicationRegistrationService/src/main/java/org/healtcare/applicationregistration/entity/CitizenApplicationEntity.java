package org.healtcare.applicationregistration.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Citizen_Applicant")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CitizenApplicationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_reg_seq")
	@SequenceGenerator(name = "app_reg_seq", sequenceName = "APPLICATION_REG_SEQ", allocationSize = 1)
	private Integer appId;
	@Column(length = 30)
	private String fullName;

	@Column(length = 30)
	private String citizenEmail;

	@Column(length = 1)
	private String citizenGender;

	private Long phoneno;
	private Long ssn;
	@Column(length = 30)
	private String stateName;

	private LocalDate dob;

	private String createdBy;

	private String updatedBy;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate creationDate;
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate updateDate;

}
