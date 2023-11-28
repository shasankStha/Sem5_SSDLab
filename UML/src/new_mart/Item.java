package new_mart;

import java.util.ArrayList;

public class Item {
	private String itemId;
	private String name;
	private String description;
	private Double price;
	private ArrayList<OrderLine> order;
	public boolean isRestricted() {
		return false;
	}

}
