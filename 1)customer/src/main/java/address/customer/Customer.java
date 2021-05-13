package address.customer;

public class Customer {
	private int customerid;
	private String customername;
	private long customernumber;
	private Address customerAddress;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getCustomernumber() {
		return customernumber;
	}
	public void setCustomernumber(long customernumber) {
		this.customernumber = customernumber;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void display(){
		System.out.println("Customer Details [customerid=" + customerid + ", customername=" + customername + ", customernumber="
				+ customernumber +"]");
		System.out.println("Address =(Street:"+getCustomerAddress().getStreet()+",City:"+getCustomerAddress().getCity()+",State:"
				+getCustomerAddress().getState()+",ZipCode:"+getCustomerAddress().getZip()+")");
	}
	public int custom() {
		System.out.print(customerid);
		return customerid;
	}
	

}
