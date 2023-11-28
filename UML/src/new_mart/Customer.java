package new_mart;

import java.util.ArrayList;
import java.util.Date;

public class Customer {

	private String customerId;
	private String name;
	private String emailAddress;
	private Date dateOfBirth;
	private final int age;
	private final Address address;
	private ArrayList<OrderHeader> orderHeader;
	
	public Customer(Address ad, Date dateOfBirth, Date currentDate){
		this.age =  currentDate.compareTo(dateOfBirth) ;
		this.address = ad;
	}
}
