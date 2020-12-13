package logic;

class Employee {
	int empId;
	String empName;
	int salary;

	public Employee(String empName, int empId, int salary) {
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}

	String getEmpName() {
		return empName;
	}

	int getEmpId() {
		return empId;
	}

	int getSalary() {
		return salary;
	}
}

class Project {
	String projName;
	int projId;
	Employee empId;

	public Project(String projName, int projId, Employee empId) {
		this.projName = projName;
		this.projId = projId;
		this.empId = empId;

	}

	String getProjName() {
		return projName;
	}

	int getProjId() {
		return projId;
	}
}

class Department {
	String deptName;
	int deptId;
	Employee empId;

	public Department(String deptName, int deptId, Employee empID) {
		this.deptName = deptName;
		this.deptId = deptId;
		this.empId = empId;
	}

	String getDeptName() {
		return deptName;
	}

	int getDeptId() {
		return deptId;
	}

}
