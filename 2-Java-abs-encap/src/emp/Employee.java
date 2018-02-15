package emp;

public class Employee extends Object {

	private int id;
	private String name;
	private double salary;
	private double bonus;

	public Employee(int id, String name) {
		this(id, name, 0.0);
	}

	public Employee(int id, String name, double salary) {
		if (id > 0) {
			this.id = id;
		}
		this.name = name;
		if (salary > 1000 && salary < 10000) {
			this.salary = salary;
			this.bonus = salary * 0.02;
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.isEmpty())
			this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 1000 && salary < 10000) {
			this.salary = salary;
			this.bonus = salary * 0.02;
		}
	}

	public double getBonus() {
		return bonus;
	}

	public String toString() {
		return "Id: " + this.id + ",Name :" + this.name + ",Salary: " + this.salary + ",bonus: " + this.bonus;
	}

}
