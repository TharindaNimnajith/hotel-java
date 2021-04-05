package models;

public class Room {
	private String customerName;

	public Room() {
		super();
		customerName = "Empty";
	}

	public Room(String customerName) {
		super();
		this.customerName = customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String toString() {
		return "Room [customerName=" + customerName + ", getCustomerName()=" + getCustomerName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
