package collectionFramework;

public class Worker {

	private int id;
	private String name;
	private String place;
	private double salary;
	
	public Worker(int id, String name, String place, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", place=" + place + ", salary=" + salary + "]";
	}
}
