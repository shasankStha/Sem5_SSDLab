package new_mart;

import java.util.ArrayList;
import java.util.Date;

public class OrderHeader {
	private String orderId;
	private Date orderDate;
	private double deliveryFee;
	private DeliveryPriority priority;
	private double orderTotal;
	private ArrayList<OrderLine> order;
	
	public OrderHeader(Customer customer, OrderLine order) {
		
	}
	
	public void addLine(Item item, int quantity) {
		
	}
	
	public boolean hasRestrictedItems() {
		
	}
	
}
