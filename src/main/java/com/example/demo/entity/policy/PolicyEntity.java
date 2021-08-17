package com.example.demo.entity.policy;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
@Entity
@Table(name="POLICY")
public class PolicyEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_HR_SEQ")
	@SequenceGenerator(name="TAB_HR_SEQ", sequenceName="TAB_HR_SEQ", allocationSize=1)
	@Column( name = "ID")
	private Long id;
	
	@Column( name = "PNAME")	
	private String policyName;
	
	@Column( name = "PDATE")
	private Date policyDate;
	
	@Column( name = "PDESC")
	private String policyDescription;

}
