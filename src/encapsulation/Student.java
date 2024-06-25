package encapsulation;

public class Student {

	private int id;
	private String name;
	private float accountNumber;
	
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
	public float getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(float accountNumber) {
		this.accountNumber = accountNumber;
	}
}
