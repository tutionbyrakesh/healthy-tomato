package com.bytestree.restful.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author rakesh
 *
 */

@Entity
@Table(name = "student")
public class Student implements java.io.Serializable {

	private static final long serialVersionUID = 4910225916550731446L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rollNumber", unique = true, nullable = false)
	private Long rollNumber;

	
	public Student(Long rollNumber, String firstname, String lastname, String stream) {
		super();
		this.rollNumber = rollNumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.stream = stream;
	}
	
	public Long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Long rollNumber) {
		this.rollNumber = rollNumber;
	}

	

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Column(name = "firstname", length = 50)
	private String firstname;

	@Column(name = "lastname", length = 50)
	private String lastname;

	@Column(name = "stream", length = 20)
	private String stream;

	public Student() {
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstname=" + firstname + ", lastname=" + lastname + ", stream="
				+ stream + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (rollNumber == null || obj == null || getClass() != obj.getClass())
			return false;
		Student toCompare = (Student) obj;
		return rollNumber.equals(toCompare.rollNumber);
	}

	@Override
	public int hashCode() {
		return rollNumber == null ? 0 : rollNumber.hashCode();
	}

}
