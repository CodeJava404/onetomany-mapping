package org.google.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="stud_tble")
@ToString
public class Student {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentRollNo;
	private String studentName;
	private long studentMobileNummber;
	
	@ManyToOne
	private Department department;
	

}

