package labtasks;

import java.io.Serializable;

public class Student5th implements Comparable<Student5th>,Serializable{ 
	
	private long id;
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Student5th(String firstName, String lastName, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	

	public Student5th(long id, String firstName, String lastName, String department, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.email = email;
	}
	
	
	
	@Override
	public String toString() {
		return "Student5th [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", email=" + email + "]";
	}
	public int compareTo(Student5th o) {
		// TODO Auto-generated method stub
		return firstName.compareTo(o.firstName);
	}
	
	
	
}
