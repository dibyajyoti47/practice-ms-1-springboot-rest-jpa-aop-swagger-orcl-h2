package com.example.demo.entity.emp;

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
@Table(name = "EMPLOYEE")
public class EmpEntity {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_EMPLOYEE_SEQ")
	@SequenceGenerator(name="TAB_EMPLOYEE_SEQ", sequenceName="TAB_EMPLOYEE_SEQ", allocationSize=1)
	private Long id;
	
	@Column(name = "EMPNO")
	private Integer empNo;
	
	@Column(name = "ENAME")
	private String empName;
	
	@Column(name = "JOB")
	private	String job;
	
	@Column(name = "MGR")
	private Integer manager;
	
	@Column(name = "HIREDATE")
	private Date hireDate;
	
	@Column(name = "SAL")
	private Long salary;
	
	@Column(name = "COMM")
	private Integer commission;
	
	@Column(name = "DEPTNO")
	private Integer deptNo;
}
