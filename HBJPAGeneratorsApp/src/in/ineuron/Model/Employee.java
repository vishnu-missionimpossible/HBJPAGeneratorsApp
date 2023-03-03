package in.ineuron.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="empTab")
public class Employee {
    
	
	
	/*@Id
	@Column(name="eid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;*/
	
	@Id
	@Column(name="eid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;

	@Column(name="ename",length = 20)
	private String empName;

	@Column(name="esal")
	private Double empSal;

	static {
		System.out.println("Employee.class is loading...");
	}

	public Employee() {
		System.out.println("Zero parameter consturctor is used by Hibernate....");
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
		System.out.println("Employee.setEmpId()");
	}

	public void setEmpName(String empName) {
		this.empName = empName;
		System.out.println("Employee.setEmpName()");
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
		System.out.println("Employee.setEmpSal()");
	}
	
	

	public Double getEmpSal() {
		System.out.println("Employee.getEmpSal()");
		return empSal;
	}

	public Integer getEmpId() {
		System.out.println("Employee.getEmpId()");
		return empId;
	}

	public String getEmpName() {
		System.out.println("Employee.getEmpName()");
		return empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
